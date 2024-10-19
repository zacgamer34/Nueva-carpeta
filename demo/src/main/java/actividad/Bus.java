package actividad;


public class Bus extends TransportePublico {
    private int capacidad;

    
    public Bus(String ruta, int capacidad) {
        super("Bus", ruta);
        this.capacidad = capacidad;
    }

    
    public double calcularTarifaBus() {
        return super.calcularTarifa() + capacidad * 0.1; 
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Ruta: " + getRuta());
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Tarifa: " + calcularTarifaBus());
    }
}
