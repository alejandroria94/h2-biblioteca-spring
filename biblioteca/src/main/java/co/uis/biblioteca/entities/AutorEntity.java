package co.uis.biblioteca.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "autores")

public class AutorEntity {
    @Id
    @Column(name = "codigo", nullable = false, unique = true, length = 100)
    @NotEmpty
    @NotNull
    private String codigo;

    @Column(name = "nombre", length = 100)
    @NotEmpty
    @NotNull
    private String nombre;

    @Column(name = "nacionalidad", length = 100)
    @NotEmpty
    @NotNull
    private String nacionalidad;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_autor")
    private List<LibroEntity> libros;

    public AutorEntity() {

    }
    public AutorEntity(String codigo, String nombre, String nacionalidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

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
