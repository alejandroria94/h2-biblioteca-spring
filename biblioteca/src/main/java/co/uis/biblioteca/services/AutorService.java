package co.uis.biblioteca.services;

import co.uis.biblioteca.dtos.AutorDTO;
import co.uis.biblioteca.entities.AutorEntity;
import co.uis.biblioteca.mappers.AutorMapper;
import co.uis.biblioteca.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private AutorMapper autorMapper;

    public List<AutorDTO> findAll() {
        var a= autorRepository.findAll().stream()
                .map(autorMapper::toDTO)
                .collect(Collectors.toList());
        return a;
    }

    public AutorEntity save(AutorEntity autor) {
        return autorRepository.save(autor);
    }
}
