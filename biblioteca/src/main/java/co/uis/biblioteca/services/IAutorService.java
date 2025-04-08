package co.uis.biblioteca.services;

import co.uis.biblioteca.dtos.AutorDTO;
import co.uis.biblioteca.entities.AutorEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface IAutorService {
    public List<AutorEntity> findAll();

    public List<AutorDTO> findAllDto() ;


    public AutorEntity save(AutorEntity autor) ;

    public Optional<AutorEntity> findById(String codigo);

    public void deleteById(String codigo);

    public AutorEntity encontrarAutor(AutorEntity autor) ;

}
