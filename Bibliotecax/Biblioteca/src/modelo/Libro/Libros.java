/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Libro;

/**
 *
 * @author vaio
 */
public class Libros {
    private String nombre;
    private String nserie;
    private String año;
    private String ISBN;
    private String autor;
    private String Editorial;
    private String Estado;
    private String idioma;
    private String Categoria;

    public Libros() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public String toString() {
        return "Libros{" + "nombre=" + nombre + ", nserie=" + nserie + ", a\u00f1o=" + año + ", ISBN=" + ISBN + ", autor=" + autor + ", Editorial=" + Editorial + ", Estado=" + Estado + ", idioma=" + idioma + ", Categoria=" + Categoria + '}';
    }
    
    
    
    
    
}
