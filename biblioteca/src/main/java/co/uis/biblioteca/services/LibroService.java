package co.uis.biblioteca.services;

import co.uis.biblioteca.entities.LibroEntity;
import co.uis.biblioteca.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<LibroEntity> findAll() {
        return libroRepository.findAll();
    }

    public LibroEntity save(LibroEntity libro) {
        return libroRepository.save(libro);
    }
}
