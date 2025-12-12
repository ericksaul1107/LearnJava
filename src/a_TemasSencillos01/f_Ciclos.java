package a_TemasSencillos01;

// En un ciclo mientras la condicion sea verdadera permite repetir ejecutanto su bloque de codigo.
// Todos los ciclos trabajan con valores boleanos (true / false).

// Hay 3 tipos de ciclos. (Mientras sea verdadera la condicion, se sigue ejecutando).

//   While.
//          Repite la ejecucion del bloque de codigo mientras la condicion sea verdadera. (no sabes cuantas veces se iterara).

//   Do While.
//          Ejecuta al menos un vez su bloque de codigo porque su condicion a revisar esta al ultimo. (al menos una vez se itera).
//          Repite la ejecucion del bloque de codigo mientras la condicion sea verdadera.

//   For.
//          Especificamos cuantas veces queremos repetir (iterar) el bloque de codigo. (hasta donde queremos parar).
//          Repite la ejecucion del bloque de codigo mientras la condicion sea verdadera.

//      For.each
//          No se necesita indice, solamente recorre los arreglos o colecciones facilmente.
//          For Each  =   Por cada elemento
//          Nos permite recorrer un array o una collection.

import java.util.Scanner;

public class f_Ciclos {

    public static void main(String[] args) {
        //metodoWhile();
        //metodoDoWhile();
        //metodoFor();
        metodoForEach();
    }

    public static void metodoWhile() {
        // Imprime del 1 al 10 con While.

        final int LIMITE = 10;
        int contador = 1;

        // Mientras la condicion sea verdadera (true) se ejecuta (itera) el bloque de codigo.
        while (contador <= LIMITE) {
            System.out.println(contador);   //Si solo tenemos una linea de codigo, se pueden omitir las llaves.
            contador++;   //Post incremento, la siguiente vez que se use, se le añadira uno, o sea justamente arriba en la condicion.
        }
    }

    public static void metodoDoWhile() {
        // Imprime del 1 al 10 con Do While.

        final int LIMITE = 10;
        int contador = 1;

        // Se itera por lo menos una vez.
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= LIMITE);    // Mientras la condicion sea verdadera (true) se ejecuta (itera) el bloque de codigo.
    }

    public static void metodoFor() {
        // Imprime del 1 al 10 con For.

        final int LIMITE = 10;

        // Cuando sabes el numero exacto de repeticiones, en este caso, hasta la variable LIMITE.
        //                          (   1  )       (   3   )
        for (int contador = 1; contador <= LIMITE; contador++) {     // Mientras la condicion sea verdadera (true) se ejecuta (itera) el bloque de codigo.
            System.out.println(contador);
            //            (   2   )

        }
    }

    public static void metodoForEach() {
        Scanner conosla = new Scanner(System.in);

        final int LIMITE = 10;
        int edades [] = new int[LIMITE];

        for (int i = 0; i < edades.length; i++){
            System.out.println("Ingrese valor para la posicion: " +i);
            edades[i] = Integer.parseInt(conosla.nextLine());
        }

        // La variable almacena cada uno de los valores que vamos recorriendo. Uno valor a la vez.
        for (int edad : edades){
            System.out.println(edad);
        }

    }
}
