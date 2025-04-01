package co.uis.biblioteca.services;

import co.uis.biblioteca.entities.AutorEntity;
import co.uis.biblioteca.entities.CategoriaEntity;
import co.uis.biblioteca.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaEntity> findAll() {
        return categoriaRepository.findAll();
    }

    public CategoriaEntity save(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }

    public Optional<CategoriaEntity> findById(Long id) {
        return categoriaRepository.findById(id);
    }
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}
