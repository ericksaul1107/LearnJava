package SistemaDeVentas;

public class Producto {

    private static int contador = 0;    // Varables de la clase.
    private final int idproducto;       // Constante, ya no podemos modificarla, por eso solo el metodo get. Atributos de solo lectura.
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.idproducto = ++Producto.contador;
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


    public int getIdproducto() {
        return idproducto;
    }


    @Override
    public String toString(){
        return "id Producto: " +this.idproducto+ "   Nombre: " +this.nombre+ "   Precio: " +this.precio;
    }
}
