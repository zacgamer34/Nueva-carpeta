package main.java.com.example;
public class Revista extends Material {
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo, String autor, int añoPublicacion, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String getTipoMaterial() {
        return "Revista";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        return 0.5 * diasPrestamo; 
    }

    public void mostrarDetallesRevista() {
        mostrarInformacion();
        System.out.println("Número de Edición: " + numeroEdicion);
        System.out.println("Mes de Publicación: " + mesPublicacion);
    }
}