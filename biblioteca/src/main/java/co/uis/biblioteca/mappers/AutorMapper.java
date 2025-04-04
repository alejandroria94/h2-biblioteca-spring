package co.uis.biblioteca.mappers;

import co.uis.biblioteca.dtos.AutorDTO;
import co.uis.biblioteca.entities.AutorEntity;
import org.springframework.stereotype.Component;

@Component
public class AutorMapper {
    public AutorDTO toDTO(AutorEntity autor) {
        AutorDTO dto = new AutorDTO();
        dto.setCodigo(autor.getCodigo());
        dto.setNombre(autor.getNombre());
        dto.setNacionalidad(autor.getNacionalidad());
       // dto.setLibros(autor.getLibros());
        return dto;
    }

    public AutorEntity toEntity(AutorDTO dto) {
        AutorEntity autor = new AutorEntity();
        autor.setCodigo(dto.getCodigo());
        autor.setNombre(dto.getNombre());
        autor.setNacionalidad(dto.getNacionalidad());
        return autor;
    }
}
