package co.uis.biblioteca.services;

import co.uis.biblioteca.entities.AutorEntity;
import co.uis.biblioteca.entities.LibroEntity;
import co.uis.biblioteca.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<LibroEntity> findAll() {
        return libroRepository.findAll();
    }

    public LibroEntity save(LibroEntity libro) {
        return libroRepository.save(libro);
    }

    public Optional<LibroEntity> findById(String isbn) {
        return libroRepository.findById(isbn);
    }
    public void deleteById(String isbn) {
        libroRepository.deleteById(isbn);
    }

    public LibroEntity actualizarLibro(LibroEntity libroNuevo, String isbn) {
       return libroRepository.findById(isbn)
                .map(l -> {
                    l.setIsbn(l.getIsbn());
                    l.setNombre(libroNuevo.getNombre());
                    l.setAnnio(libroNuevo.getAnnio());
                    l.setNumeroDePaginas(libroNuevo.getNumeroDePaginas());
                    l.setCodigoAutor(libroNuevo.getCodigoAutor());
                    l.setIdCategoria(libroNuevo.getIdCategoria());
                    return libroRepository.save(l);
                }).orElseGet(() -> libroRepository.save(libroNuevo));
    }
}
