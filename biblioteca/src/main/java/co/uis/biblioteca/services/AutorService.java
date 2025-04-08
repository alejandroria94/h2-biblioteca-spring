package co.uis.biblioteca.services;

import co.uis.biblioteca.dtos.AutorDTO;
import co.uis.biblioteca.entities.AutorEntity;
import co.uis.biblioteca.mappers.AutorMapper;
import co.uis.biblioteca.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
class AutorService implements IAutorService {
    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private AutorMapper autorMapper;

    @Override
    public List<AutorEntity> findAll() {
        return autorRepository.findAll();
    }

    @Override
    public List<AutorDTO> findAllDto() {
        var a = autorRepository.findAll().stream()
                .map(autorMapper::toDTO)
                .collect(Collectors.toList());
        return a;
    }

    @Override
    public AutorEntity save(AutorEntity autor) {

        return autorRepository.save(autor);
    }

    @Override
    public Optional<AutorEntity> findById(String codigo) {
        return autorRepository.findById(codigo);
    }

    @Override
    public void deleteById(String codigo) {
        autorRepository.deleteById(codigo);
    }

    @Override
    @Transactional(readOnly = true)
    public AutorEntity encontrarAutor(AutorEntity autor) {
        return autorRepository.findById(autor.getCodigo()).orElse(null);
    }
}
