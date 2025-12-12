package a_TemasSencillos04;

// Una clase (padre o superclase) pueda heredar sus metodos y atributos, a una clase hija.
// Esta clase hija tambien puede tener sus propios metodos y usar los que le heredaron.

// Los metodos y atributos que se van a heredar, tienen que ser publicos para que suceda la herencia.

// Crea jerarquías lógicas (por ejemplo: Persona → Empleado → Gerente).

public class a_Herencia {
    public static void main(String[] args) {

        System.out.println("-Objeto Animal-");
        Animal objAnimal = new Animal();
        objAnimal.comer();
        objAnimal.dormir();

        System.out.println();

        System.out.println("-Objeto Perro-");
        Perro objPerro = new Perro();
        objPerro.comer();   // Método  heredado.
        objPerro.dormir();  // Método  heredado.
        objPerro.ladrar();  // Método propio.
    }
}





class Animal{
    public void comer(){
        System.out.println("Como muchas veces al dia");
    }
    public void dormir(){
        System.out.println("Duermo en el dia");
    }
}




class Perro extends Animal{
    public void ladrar(){
        System.out.println("Ladro");
    }
}