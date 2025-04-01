package co.uis.biblioteca.controllers;

import co.uis.biblioteca.dtos.AutorDTO;
import co.uis.biblioteca.entities.AutorEntity;
import co.uis.biblioteca.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

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
    public AutorEntity save(@RequestBody AutorEntity autor) {
        return autorService.save(autor);
    }

    @GetMapping("/{codigo}")
    public Optional<AutorEntity> findById(@PathVariable String codigo) {
        return autorService.findById(codigo);
    }
    @DeleteMapping("/{codigo}")
    public void deleteById(@PathVariable String codigo) {
        autorService.deleteById(codigo);
    }
}
