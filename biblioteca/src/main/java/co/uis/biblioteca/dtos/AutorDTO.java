package co.uis.biblioteca.dtos;

import co.uis.biblioteca.entities.LibroEntity;
import co.uis.biblioteca.entities.NacionalidadEntity;

import java.util.List;


public class AutorDTO {
    private String codigo;
    private String nombre;
    private NacionalidadEntity nacionalidad;
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

    public NacionalidadEntity getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(NacionalidadEntity nacionalidad) {
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
