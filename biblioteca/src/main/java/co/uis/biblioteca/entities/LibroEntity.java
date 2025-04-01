package co.uis.biblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class LibroEntity {
    @Id
    @Column(name = "isbn", length = 100)
    private String isbn;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "numero_de_paginas")
    private Integer numeroDePaginas;

    @Column(name = "annio")
    private Integer annio;

    @Column(name = "codigo_autor", length = 100)
    private String codigoAutor;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public Integer getAnnio() {
        return annio;
    }

    public void setAnnio(Integer annio) {
        this.annio = annio;
    }

    public String getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(String codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}
