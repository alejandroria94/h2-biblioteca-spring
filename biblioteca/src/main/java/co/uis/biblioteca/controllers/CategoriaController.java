package co.uis.biblioteca.controllers;

import co.uis.biblioteca.entities.CategoriaEntity;
import co.uis.biblioteca.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaEntity> findAll() {
        return categoriaService.findAll();
    }

    @PostMapping
    public CategoriaEntity save(@RequestBody CategoriaEntity categoria) {
        return categoriaService.save(categoria);
    }
}
