package co.uis.biblioteca.dtos;

import co.uis.biblioteca.entities.LibroEntity;

import java.util.List;


public class AutorDTO {
    private String codigo;
    private String nombre;
    private String nacionalidad;
    //private List<LibroEntity> libros;

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

//    public List<LibroEntity> getLibros() {
//        return libros;
//    }
//
//    public void setLibros(List<LibroEntity> libros) {
//        this.libros = libros;
//    }
}
