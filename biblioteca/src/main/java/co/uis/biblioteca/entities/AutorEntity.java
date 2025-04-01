package co.uis.biblioteca.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "autores")

public class AutorEntity {
    @Id
    @Column(name = "codigo", nullable = false, unique = true, length = 100)
    private String codigo;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "nacionalidad", length = 100)
    private String nacionalidad;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_autor")
    private List<LibroEntity> libros;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<LibroEntity> getLibros() {
        return libros;
    }

    public void setLibros(List<LibroEntity> libros) {
        this.libros = libros;
    }
}
