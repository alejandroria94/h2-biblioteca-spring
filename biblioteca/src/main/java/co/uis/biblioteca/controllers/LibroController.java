package co.uis.biblioteca.controllers;

import co.uis.biblioteca.entities.LibroEntity;
import co.uis.biblioteca.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{isbn}")
    public Optional<LibroEntity> findById(@PathVariable String isbn) {
        return libroService.findById(isbn);
    }
    @DeleteMapping("/{isbn}")
    public void deleteById(@PathVariable String isbn) {
        libroService.deleteById(isbn);
    }

    @PutMapping("/{isbn}")
    LibroEntity replaceEmployee(@RequestBody LibroEntity libro, @PathVariable String isbn) {
        return libroService.actualizarLibro(libro,isbn);
    }

}
