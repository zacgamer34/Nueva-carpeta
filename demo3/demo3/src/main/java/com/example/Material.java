package main.java.com.example;


public abstract class Material {
    String titulo;
    private String autor;
    private int añoPublicacion;
    protected boolean disponible;

    public Material(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println(titulo + " ha sido prestado.");
        } else {
            System.out.println(titulo + " no está disponible para préstamo.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println(titulo + " ha sido devuelto.");
    }

    public abstract String getTipoMaterial();
    public abstract double calcularTarifaPrestamo(int diasPrestamo);
}