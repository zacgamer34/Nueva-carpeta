package actividad;


public class Metro extends TransportePublico {
    private int numeroEstaciones;

    
    public Metro(String ruta, int numeroEstaciones) {
        super("Metro", ruta);
        this.numeroEstaciones = numeroEstaciones;
    }

    
    public double calcularTarifaMetro() {
        return super.calcularTarifa() + numeroEstaciones * 0.05; 
    }

    
    public void mostrarMapa() {
        System.out.println("Mostrando el mapa del metro para la ruta: " + getRuta());
    }
}
