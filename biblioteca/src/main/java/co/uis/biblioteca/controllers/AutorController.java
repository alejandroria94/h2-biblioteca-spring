package co.uis.biblioteca.controllers;

import co.uis.biblioteca.dtos.AutorDTO;
import co.uis.biblioteca.entities.Autor;
import co.uis.biblioteca.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<AutorDTO> findAll() {
        var a=autorService.findAll();
        return a;
    }

    @PostMapping
    public Autor save(@RequestBody Autor autor) {
        return autorService.save(autor);
    }
}
