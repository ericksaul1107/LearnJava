package MaquinaSnacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {

    private static int contadorSnack;
    private int idSnack;
    private String nombre;
    private double precio;

    public Snack() {                                // Constructor vacio para ser un Java Bean.
        this.idSnack = ++Snack.contadorSnack;       // Como el valor inicial es 0, primero se le agrega ++ para que sea a 1
    }

    public Snack(String nombre, double precio) {
        this();                                     // this()  Esto llama al contructor vacio. Debe estar primero la llamada al constructor vacio. Para inicializar todos los atributos.
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getContadorSnack() {
        return contadorSnack;
    }

// No vamos a dejar modificar.

//    public static void setContadorSnack(int contadorSnack) {
//        Snack.contadorSnack = contadorSnack;
//    }

    public int getIdSnack() {
        return idSnack;
    }

// No vamos a dejar modificar.

//    public void setIdSnack(int idSnack) {
//        this.idSnack = idSnack;
//    }

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

    // Para mostrar los datos del objeto.
    @Override   // Override porque todas las clases heredan de la clase Object y contiene ya este metodo.
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    // Para comparar el contenido a los objetos de tipo snack si son iguales. Regresa Bolleano.
    @Override   // Override porque todas las clases heredan de la clase Object y contiene ya este metodo.
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);   // Atributos que se van a comparar en los objetos.
    }

    // Para comparar como el id de los objetos de tipo snack si son iguales. Regresa int.
    @Override   // Override porque todas las clases heredan de la clase Object y contiene ya este metodo.
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
