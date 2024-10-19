package actividad;


public class Transmilenio extends TransportePublico {
    private int numeroParadas;

    
    public Transmilenio(String ruta, int numeroParadas) {
        super("Transmilenio", ruta);
        this.numeroParadas = numeroParadas;
    }

    
    public double calcularTarifaTransmilenio() {
        return super.calcularTarifa() + numeroParadas * 0.2; 
    }

    
    public void mostrarRuta() {
        System.out.println("Mostrando la ruta del Transmilenio para la ruta: " + getRuta());
    }
}

    

