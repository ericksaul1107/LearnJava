package a_TemasSencillos02;

// Un arreglo nos permite alamacenar multiples valores de un solo tipo, en una sola variable.
// Todos los elementos deben ser del mismo tipo.
// Su tamaño es fijo, se define al crearlo.
// Se accede a los elementos mediante índices [0][1][2][3][...].

// Una matriz es un arreglo bidemencional, renglones y columnas.

public class a_Arreglos_y_Matriz {

    public static void main(String[] args) {
        metodoArreglo();
        metodoMatriz();
    }

    // Arreglos. -------------------------------------------------------------------------------------------------------
    public static void metodoArreglo(){

        // Inicializar con valores directamente. A esto se le conoce como Sintaxis Simplificada.      ------------------

        int [] arregloSimplificado = {100, 200, 300};
        System.out.println("Valor: " +arregloSimplificado[0]);
        System.out.println("Valor: " +arregloSimplificado[1]);
        System.out.println("Valor: " +arregloSimplificado[2]);



        // Declara e inicializar por separado. --------------------

        // Memoria Stack.  Ahi se almacenan las variables.
        int [] arreglo;
        // Los [] indica que la variable no es un tipo de dato simple, sino que almacenará varios elementos del mismo tipo.

        // Memoria Heap.   Ahi se almacenan los objetos.
        arreglo = new int[5];
        // new int [], reserva un espacio en memoria (crea un objeto). Al crear un arreglo (objeto) nuevo, si es Int sus valores estan en 0.-



        // Declarar e inicializar. --------------------------------

        int [] arreglo01 = new int[10];
        arreglo01 [0] = 8;
        arreglo01 [1] = 3;
        arreglo01 [9] = 25;

        // Para imprimir los valores de un arreglo, debemos imprimir indice por indice, cada uno.
        System.out.println("Valor 0: " +arreglo01[0]);
        System.out.println("Valor 1: " +arreglo01[1]);
        System.out.println("Valor 2: " +arreglo01[2]);
        System.out.println("Valor 9: " +arreglo01[9]);

        // Si imprimimos solo el puro nombre del arreglo, imprimiremos su referencia en memoria del objeto (arreglo).
        System.out.println("Su referena en memoeria es: " +arreglo01);
    }

    // / Una matriz es un arreglo bidemencional, renglones y columnas.--------------------------------------------------
    public static void metodoMatriz(){
        int [][] matriz01 = new int[5][4];
        matriz01 [0][0] = 100;
        matriz01 [1][0] = 200;
        matriz01 [2][1] = 300;

        // Para imprimir los valores de un arreglo, debemos imprimir indice por indice, cada uno.
        System.out.println("Valor 0: " +matriz01[0][0]);
        System.out.println("Valor 1: " +matriz01[1][0]);
        System.out.println("Valor 2: " +matriz01[1][1]);
        System.out.println("Valor 9: " +matriz01[2][0]);

        // Si imprimimos solo el puro nombre del arreglo, imprimiremos su referencia en memoria del objeto (arreglo).
        System.out.println("Su referena en memoeria es: " +matriz01);
    }
}
