package co.uis.biblioteca.controllers;

import co.uis.biblioteca.entities.LibroEntity;
import co.uis.biblioteca.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<LibroEntity> findAll() {
        return libroService.findAll();
    }

    @PostMapping
    public LibroEntity save(@RequestBody LibroEntity libro) {
        return libroService.save(libro);
    }
}
