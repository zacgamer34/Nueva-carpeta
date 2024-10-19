package actividad;


public class Main {
    public static void main(String[] args) {
        
        Bus bus = new Bus("Ruta 1", 50);
        bus.setTarifa(1500);
        bus.setDistanciaRecorrida(10.5);
        bus.setTiempoRecorrido(30);
        bus.mostrarInformacion();

        
        Metro metro = new Metro("Línea A", 20);
        metro.setTarifa(2000);
        metro.mostrarMapa();
        System.out.println("Tarifa del metro: " + metro.calcularTarifaMetro());

        
        Transmilenio transmilenio = new Transmilenio("Ruta T", 10);
        transmilenio.setTarifa(2500);
        transmilenio.mostrarRuta();
        System.out.println("Tarifa del Transmilenio: " + transmilenio.calcularTarifaTransmilenio());
    }
}
