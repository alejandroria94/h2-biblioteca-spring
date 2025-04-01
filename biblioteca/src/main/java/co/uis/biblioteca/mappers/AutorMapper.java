package co.uis.biblioteca.mappers;

import co.uis.biblioteca.dtos.AutorDTO;
import co.uis.biblioteca.entities.Autor;
import org.springframework.stereotype.Component;

@Component
public class AutorMapper {
    public AutorDTO toDTO(Autor autor) {
        AutorDTO dto = new AutorDTO();
        dto.setCodigo(autor.getCodigo());
        dto.setNombre(autor.getNombre());
        dto.setNacionalidad(autor.getNacionalidad());
        dto.setLibros(autor.getLibros());
        return dto;
    }

    public Autor toEntity(AutorDTO dto) {
        Autor autor = new Autor();
        autor.setCodigo(dto.getCodigo());
        autor.setNombre(dto.getNombre());
        autor.setNacionalidad(dto.getNacionalidad());
        return autor;
    }
}
