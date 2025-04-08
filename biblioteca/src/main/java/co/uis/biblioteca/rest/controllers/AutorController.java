package co.uis.biblioteca.rest.controllers;

import co.uis.biblioteca.dtos.AutorDTO;
import co.uis.biblioteca.entities.AutorEntity;
import co.uis.biblioteca.services.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private IAutorService iAutorService;

    @GetMapping
    public List<AutorEntity> findAll() {
        var a = iAutorService.findAll();
        return a;
    }

    @GetMapping("/dto")
    public List<AutorDTO> findAllDto() {
        var a = iAutorService.findAllDto();
        return a;
    }

    @PostMapping
    public AutorEntity save(@RequestBody AutorEntity autor) {
        return iAutorService.save(autor);
    }

    @GetMapping("/{codigo}")
    public Optional<AutorEntity> findById(@PathVariable String codigo) {
        return iAutorService.findById(codigo);
    }

    @DeleteMapping("/{codigo}")
    public void deleteById(@PathVariable String codigo) {
        iAutorService.deleteById(codigo);
    }
}
