package co.uis.biblioteca.services;

import co.uis.biblioteca.entities.NacionalidadEntity;
import co.uis.biblioteca.repositories.NacionalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NacionalidadService {
    @Autowired
    private NacionalidadRepository nacionalidadRepository;

    public List<NacionalidadEntity> obtenerTodas() {
        return nacionalidadRepository.findAll();
    }

    public NacionalidadEntity guardar(NacionalidadEntity nacionalidad) {
        return nacionalidadRepository.save(nacionalidad);
    }

    public void eliminar(Long id) {
        nacionalidadRepository.deleteById(id);
    }
}
