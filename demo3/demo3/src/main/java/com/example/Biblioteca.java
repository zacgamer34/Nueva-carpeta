package main.java.com.example;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Material> materiales;

    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
        System.out.println(material.getTipoMaterial() + " '" + material.titulo + "' agregado a la biblioteca.");
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.titulo.equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null; 
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de Materiales:");
        for (Material material : materiales) {
            material.mostrarInformacion();
            System.out.println("Tipo de Material: " + material.getTipoMaterial());
            System.out.println("---------------------------");
            
            if (material instanceof Libro) {
                ((Libro) material).mostrarDetallesLibro();
            } else if (material instanceof Revista) {
                ((Revista) material).mostrarDetallesRevista();
            } else if (material instanceof Audiovisual) {
                ((Audiovisual) material).mostrarDetallesAudiovisual();
            }
            System.out.println();
        }
    }
}