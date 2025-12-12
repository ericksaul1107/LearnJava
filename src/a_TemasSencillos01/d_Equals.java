package a_TemasSencillos01;
import java.util.Scanner;

public class d_Equals {

    public static void main(String[] args) {
        metodoCompararCadenas();
    }

    public static void metodoCompararCadenas(){
        Scanner consola = new Scanner(System.in);

        String cadena1 = "juan";
        String cadena2 = "juan";
        String cadena3;

    // La cadena1 y cadena 2 apuntan al mismo objeto en memoria porque los dos tiene "juan".

    // == Compra referencias.

    // Compara si dos variables apuntan al mismo objeto en memoria.
    // Aqui realmente estamos preguntando si los objetos son iguales, y da verdadero porque apuntan al mismo objeto.
        if (cadena1 == cadena2){
            System.out.println("Las cadenas son iguales");
        }   else {
            System.out.println("Las cadenas son distintas");
        }

    // Aqui al pedir un nuevo valor usando consola.nextLine() se crea un nuevo objeto en memoria distinto, aunque igual proporcionemos "juan".
        System.out.println("Ingrese una cadena");
        cadena3 = consola.nextLine();

    // Aqui realmente estamos preguntando si el primer objeto "juan" es igual al nuevo objeto que introducimos que tambien es "juan" pero distinto objeto.
    // Nos va a decir que es false, apuntan a distintos objetos en memoria.
        if (cadena1 == cadena3){
            System.out.println("Las cadenas son iguales con ==   ");
        }   else {
            System.out.println("Las cadenas son distintas con == ");
        }



    // Este metodo .equals de la clase String nos permite comparar el contenido de las cadenas, y no a las referencias en memoria.  Devuelve valor boleano.
        if (cadena1.equals(cadena3)){
            System.out.println("Las cadenas son iguales con equals");
        }   else {
            System.out.println("Las cadenas son distintas con equals");
        }

        // Si queremos ignorar las mayusculas usamos el metodo .equalsIgnoreCase.
        if (cadena1.equalsIgnoreCase(cadena3)){
            System.out.println("Las cadenas son iguales con equalsIgnoreCase");
        }   else {
            System.out.println("Las cadenas son distintas con equalsIgnoreCase");
        }
    }
}
