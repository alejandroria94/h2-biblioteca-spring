package co.uis.biblioteca.repositories;

import co.uis.biblioteca.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, String> {
}
