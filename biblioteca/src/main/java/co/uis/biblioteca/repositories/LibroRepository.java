package co.uis.biblioteca.repositories;

import co.uis.biblioteca.entities.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<LibroEntity, String> {
}
