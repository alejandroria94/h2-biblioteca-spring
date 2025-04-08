package co.uis.biblioteca.repositories;

import co.uis.biblioteca.entities.NacionalidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NacionalidadRepository extends JpaRepository<NacionalidadEntity, Long> {
}
