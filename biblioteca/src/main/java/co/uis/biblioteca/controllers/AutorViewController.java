package co.uis.biblioteca.controllers;


import co.uis.biblioteca.entities.AutorEntity;
import co.uis.biblioteca.entities.NacionalidadEntity;
import co.uis.biblioteca.services.IAutorService;
import co.uis.biblioteca.services.NacionalidadService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AutorViewController {
    @Autowired
    IAutorService iAutorService;
    @Autowired
    NacionalidadService nacionalidadService;
    private final String vistaModificar = "/autores/autores_modificar";
    private final String autoresView = "/autores/autores_view";
    private final String raiz = "redirect:/";

    @GetMapping("/")
    public String inicio(Model model) {
        var autores = iAutorService.findAll();
        model.addAttribute("autores", autores);
        return autoresView;
    }

    @GetMapping("/agregar")
    public String agregar(Model model) {
        model.addAttribute("autor", new AutorEntity());
        List<NacionalidadEntity> nacionalidades=nacionalidadService.obtenerTodas();
        model.addAttribute("nacionalidades",nacionalidades);
        return vistaModificar;
    }

    @PostMapping("/guardar")
    public String guardar(@Valid @ModelAttribute("autor") AutorEntity autor, Errors errores, Model model) {
        if (errores.hasErrors()) {
            List<NacionalidadEntity> nacionalidades=nacionalidadService.obtenerTodas();
            model.addAttribute("nacionalidades",nacionalidades);
            model.addAttribute("autor", autor);
            return vistaModificar;
        } else {
            iAutorService.save(autor);
            return raiz;
        }

    }

    @GetMapping("/editar/{codigo}")
    public String editar(AutorEntity autor, Model model) {
        autor = iAutorService.encontrarAutor(autor);
        model.addAttribute("autor", autor);
        List<NacionalidadEntity> nacionalidades=nacionalidadService.obtenerTodas();
        model.addAttribute("nacionalidades",nacionalidades);
        return vistaModificar;
    }

    @GetMapping("/eliminar{codigo}")
    public String eliminar(AutorEntity autor) {
        iAutorService.deleteById(autor.getCodigo());
        return raiz;
    }


}
