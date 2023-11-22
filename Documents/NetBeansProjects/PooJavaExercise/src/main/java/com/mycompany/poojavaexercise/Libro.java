package com.mycompany.poojavaexercise;

public class Libro {
    private String titulo;
    private String autor;
    private int num_ejemplares;
    private int num_ejem_prestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int num_ejemplares, int num_ejem_prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_ejemplares = num_ejemplares;
        this.num_ejem_prestados = num_ejem_prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_ejemplares() {
        return num_ejemplares;
    }

    public void setNum_ejemplares(int num_ejemplares) {
        this.num_ejemplares = num_ejemplares;
    }

    public int getNum_ejem_prestados() {
        return num_ejem_prestados;
    }

    public void setNum_ejem_prestados(int num_ejem_prestados) {
        this.num_ejem_prestados = num_ejem_prestados;
    }
    
    public boolean prestamo(){
        boolean  prestado = true;
        if(num_ejemplares > num_ejem_prestados){
            num_ejem_prestados++;
        }else{
            prestado = false;
        }
        return prestado;
    }
    public boolean devolucion(){
        boolean devuelto = true;
        if(num_ejem_prestados == 0){
            devuelto = false;
        }else{
            num_ejem_prestados--;
        }
        return devuelto;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", num_ejemplares=" + num_ejemplares + ", num_ejem_prestados=" + num_ejem_prestados + '}';
    }
    
}
