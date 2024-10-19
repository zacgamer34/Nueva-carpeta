package main.java.com.example;
public class Main {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();

       
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605, "978-3-16-148410-0", 600);
        Revista revista1 = new Revista("National Geographic", "National Geographic Society", 2021, 5, "Mayo");
        Audiovisual audiovisual1 = new Audiovisual("Inception", "Christopher Nolan", 2010, "Blu-ray", 148);

       
        miBiblioteca.agregarMaterial(libro1);
        miBiblioteca.agregarMaterial(revista1);
        miBiblioteca.agregarMaterial(audiovisual1);

        
        miBiblioteca.mostrarCatalogo();

        
        String tituloBuscar = "El Quijote";
        Material materialBuscado = miBiblioteca.buscarMaterial(tituloBuscar);
        if (materialBuscado != null) {
            System.out.println("Material encontrado: " + materialBuscado.getTipoMaterial() + " - " + materialBuscado.titulo);
        } else {
            System.out.println("Material no encontrado.");
        }

        
        libro1.prestar();
        libro1.devolver();
        revista1.prestar();
        audiovisual1.prestar();
    }
}