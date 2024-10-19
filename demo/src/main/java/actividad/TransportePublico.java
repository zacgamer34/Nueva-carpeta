package actividad;


public class TransportePublico {
    private String tipo;
    private String ruta;
    private double tarifa;
    private double distanciaRecorrida;
    private int tiempoRecorrido;

    
    public TransportePublico(String tipo, String ruta) {
        this.tipo = tipo;
        this.ruta = ruta;
    }

    
    public double calcularTarifa() {
        return tarifa;
    }

    public double calcularDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public int calcularTiempoRecorrido() {
        return tiempoRecorrido;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public void setTiempoRecorrido(int tiempoRecorrido) {
        this.tiempoRecorrido = tiempoRecorrido;
    }
}
