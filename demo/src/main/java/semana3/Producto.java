package semana3;


    

    
public class Producto {
    
    private String nombre;
    private double precio;
    private int stock;

    
    public Producto() {
        this.nombre = "Producto Desconocido";
        this.precio = 0.0;
        this.stock = 0;
    }

    
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock);
    }

    public void actualizarStock(int cantidad) {
        if (cantidad < 0) {
            System.out.println("Error: La cantidad no puede ser negativa.");
        } else {
            this.stock = cantidad;
            System.out.println("Stock actualizado a: " + stock);
        }
    }

    public double calcularPrecioTotal() {
        return precio * stock;
    }

    
    public static void main(String[] args) {
        
        Producto producto1 = new Producto();
        producto1.mostrarInformacion();
        
        
        Producto producto2 = new Producto("Camiseta", 19.99, 50);
        producto2.mostrarInformacion();

      
        producto2.actualizarStock(100);
        
       
        double precioTotal = producto2.calcularPrecioTotal();
        System.out.println("El precio total del stock es: $" + precioTotal);
    }
}

