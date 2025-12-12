package b_TemasAvanzados02;
import java.io.Serializable;

//
// Un JavaBean es una clase normal, pero organizada de forma estándar, cubriendo ciertas caracteristicas:
//      1. Tiene atributos privados
//      2. Tiene getters y setters públicos
//      3. Tiene constructor vacío
//      4. Implementacion de Interfaz Serializable
// Su objetivo es guardar datos y ser fácilmente utilizado por frameworks o herramientas.
// Permite enviar los objetos por la red o a un disco duro.

// Implements Serializable para poder trabajar con FrameWorks o servidores

public class a_JavaBean {
    public static void main(String[] args) {
        Persona obj1 = new Persona();
        obj1.setNombre("Erick");
        obj1.setEdad(23);
        System.out.println(obj1);
    }
}

class Persona implements Serializable {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}