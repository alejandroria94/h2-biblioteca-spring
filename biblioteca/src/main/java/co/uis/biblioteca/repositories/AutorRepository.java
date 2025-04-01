package co.uis.biblioteca.repositories;

import co.uis.biblioteca.entities.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorEntity, String> {
}
