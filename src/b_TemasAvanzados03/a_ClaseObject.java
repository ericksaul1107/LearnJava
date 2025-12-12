package b_TemasAvanzados03;

// Automaticamente todas las clases extienden de la clase Object.   Sin que pongamos nada.



// Clase Object
//      Override al metodo toString, para mostrar datos.    Override porque ya esta en la clase Object.
//      Si no ponemos Override, muestra la referencia en memoria




//           extens Object
class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

//    public void metodoMostrar(){
//        System.out.println("Nombre: " +nombre+ "y Edad: "  +edad);
//    }

    @Override
    public String toString(){
        return "Nombre: " +this.nombre+ " y Edad: " +this.edad;
    }
}



public class a_ClaseObject {

    public static void main(String[] args) {

        Persona obj01 = new Persona("Erick", 23);
        System.out.println(obj01);
        // Se llama de manera automatica al metodo toString, solamente si esta con Override.
        // Si no llama a la referencia en memoria.
    }

}


