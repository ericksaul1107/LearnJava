package a_TemasSencillos01;
import java.util.Scanner;

// Solamente el if-else trabaja con valores boleanos, el switch no.

//  If-Else.
//          Trabaja con valores boleanos (true/false).
//          Cuando las condiciones requieren más lógica.

//          if:       Si la condicion es verdadera, se ejecuta el bloque if.    Si es false, se pasa al else-if y se vuelve a preguntar los mismo (si es true se ejecuta).
//          else if:  Para agregar mas condiciones en caso de que if sea falso.
//          else:     Si la condicion es falsa en todas las anteriores, se ejecuta el bloque else.

//      Ternario. System.out.println(num1 > num2 ? num1 : num2);
//          Es una simplificacion del if-else.

//  Switch.
//          No trabaja con valores boleanos.
//          Cuando el código se trata de comparar una variable con valores específicos.
//          Al final de cada case, usar break.
//          Buena practica usar default al ultimo.

public class c_EstructurasControl {

    public static void main(String[] args) {
        metodoIfElse();
        metodoSwitch();
    }

//La Sentencia De Decicion (if) trabaja con valores booleanos. ---------------------------------------------------------
    public static void metodoIfElse(){

        boolean llueve = false;
        boolean nublado = true;

        if (llueve){
            System.out.println("LLeva paraguas");
        } else if (nublado) {
            System.out.println("Esta nublado");
        } else {
            System.out.println("No lleves paraguas y no esta nublado");
        }

        //--------------------------------------
        //Ver si un numero es positivo, negativo o cero.
        Scanner consola = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese numero");
        numero = Integer.parseInt(consola.nextLine());

        // Aqui usamos primeramente Sentencias De Decicion (if) que trabajan con valores booleanos y
        // usamos operadores de relacion que nos arrojan un valor booleano.

        //     True/False
        if (numero > 0){
            System.out.println("El numero " +numero+ " es positivo");
            //        True/False
        } else if (numero < 0) {
            System.out.println("El numero " +numero+ " es negativo");
        } else {
            System.out.println("El numero es el 0");
        }

        // ----------------------------------
        // Lo mismo pero sin la Sentencia De Decicion.

        boolean resultado = numero > 0;
        System.out.println("El resultado es un numero positivo? " +resultado);
    }

//La Sentencia De Decicion Switch no opera con valores boleanos. -------------------------------------------------------
    public static void metodoSwitch(){
        int dia = 4;

        switch (dia){
            case 1:
                System.out.println("Lunes");
            break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            default:
                System.out.println("Dia incorrecto");
        }

        //Desde Java 14 se puede usar ->
        switch (dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            default -> System.out.println("Incorrecto");
        }
    }

}
