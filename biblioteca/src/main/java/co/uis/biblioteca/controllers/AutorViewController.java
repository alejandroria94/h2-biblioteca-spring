package co.uis.biblioteca.controllers;


import co.uis.biblioteca.entities.AutorEntity;
import co.uis.biblioteca.services.AutorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AutorViewController {
    @Autowired
    AutorService autorService;
    private final String vistaModificar = "autores_modificar";
    private final String autoresView = "autores_view";
    private final String raiz = "redirect:/";

    @GetMapping("/")
    public String inicio(Model model) {
        var autores = autorService.findAll();
        model.addAttribute("autores", autores);
        return autoresView;
    }

    @GetMapping("/agregar")
    public String agregar(Model model) {
        model.addAttribute("autor", new AutorEntity());
        return vistaModificar;
    }

    @PostMapping("/guardar")
    public String guardar(@Valid @ModelAttribute("autor") AutorEntity autor, Errors errores) {
        if (errores.hasErrors()) {
            return vistaModificar;
        } else {
            autorService.save(autor);
            return raiz;
        }

    }

    @GetMapping("/editar/{codigo}")
    public String editar(AutorEntity autor, Model model) {
        autor = autorService.encontrarAutor(autor);
        model.addAttribute("autor", autor);
        return vistaModificar;
    }

    @GetMapping("/eliminar{codigo}")
    public String eliminar(AutorEntity autor) {
        autorService.deleteById(autor.getCodigo());
        return raiz;
    }


}
