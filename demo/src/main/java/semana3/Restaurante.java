package semana3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurante {
   
    private String nombre;
    private String tipoCocina;
    private String direccion;
    private int capacidad;
    private String horarioApertura;
    private String horarioCierre;
    private int mesasDisponibles;
    private List<String> menu;
    private Map<String, Double> preciosPlatos;

    
    public Restaurante() {
        nombre = "Restaurante";
        this.tipoCocina = "No definido";
        this.direccion = "Sin dirección";
        this.capacidad = 0;
        this.horarioApertura = "00:00";
        this.horarioCierre = "00:00";
        this.mesasDisponibles = 0;
        this.menu = new ArrayList<>();
        this.preciosPlatos = new HashMap<>();
    }

   
    public Restaurante(String nombre, String tipoCocina, String direccion, int capacidad,
                       String horarioApertura, String horarioCierre, int mesasDisponibles, List<String> menu) {
        this.nombre = nombre;
        this.tipoCocina = tipoCocina;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.mesasDisponibles = mesasDisponibles;
        this.menu = menu;
        this.preciosPlatos = new HashMap<>();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public int getMesasDisponibles() {
        return mesasDisponibles;
    }

    public void setMesasDisponibles(int mesasDisponibles) {
        this.mesasDisponibles = mesasDisponibles;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

   
    public void mostrarMenu() {
        System.out.println("Menú del " + nombre + ":");
        for (String plato : menu) {
            System.out.println(plato);
        }
    }

 
    public void reservarMesa(int numeroPersonas) {
        if (mesasDisponibles > 0 && numeroPersonas <= capacidad) {
            mesasDisponibles--;
            System.out.println("Mesa reservada para " + numeroPersonas + " personas.");
        } else {
            System.out.println("No hay mesas disponibles o el número de personas excede la capacidad.");
        }
    }

    private double calcularPrecioPlato(String nombrePlato) {
        return preciosPlatos.getOrDefault(nombrePlato, 0.0);
    }

    
    public void calcularFactura(List<String> platosPedido) {
        double total = 0.0;
        System.out.println("Factura del " + nombre + ":");
        for (String plato : platosPedido) {
            double precio = calcularPrecioPlato(plato);
            System.out.println(plato + ": $" + precio);
            total += precio;
        }
        System.out.println("Total: $" + total);
    }

        public static void main(String[] args) {
        List<String> menu = new ArrayList<>();
        menu.add("Ensalada César");
        menu.add("Pizza Margarita");
        menu.add("Sopa de tomate");

        Restaurante miRestaurante = new Restaurante("Decache Parrilla y Sabor", "Parrilla", "Calle Falsa 123",
                50, "12:00", "22:00", 10, menu);

        miRestaurante.preciosPlatos.put("Ensalada César", 12.50);
        miRestaurante.preciosPlatos.put("Pizza Margarita", 15.00);
        miRestaurante.preciosPlatos.put("Sopa de tomate", 8.00);

       
        miRestaurante.mostrarMenu();

      
        miRestaurante.reservarMesa(2);

       
        List<String> pedido = new ArrayList<>();
        pedido.add("Ensalada César");
        pedido.add("Pizza Margarita");
        miRestaurante.calcularFactura(pedido);
    }
}
