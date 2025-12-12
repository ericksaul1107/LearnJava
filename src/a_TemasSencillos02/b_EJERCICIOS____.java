package a_TemasSencillos02;
import java.util.Scanner;

public class b_EJERCICIOS____ {

    public static void main(String[] args) {
        metodoEjercicioArray01();
        metodoEjercicioArray02();
        metodoEjercicioArray03();
        metodoEjercicioMatriz01();
        metodoEjercicioMatriz02();
    }

    public static void metodoEjercicioArray01(){
        // Imprimir datos de un arreglo con Ciclo for.

        int [] iterarArreglo = new int[5];
        iterarArreglo [0] = 50;
        iterarArreglo [1] = 51;
        iterarArreglo [2] = 52;
        iterarArreglo [3] = 53;
        iterarArreglo [4] = 54;

        //                               .length, obtener largo de la cadena.   Es un metodo de la clase String
        for (int i = 0; i < iterarArreglo.length; i++){
            System.out.println("La posicion " +i+ " tiene el valor: " +iterarArreglo[i]);
        }

    }

    public static void metodoEjercicioArray02(){
        // Ingresar e imprimir datos de un arreglo con Ciclo for, pedimos largo del arreglo.

        Scanner consola = new Scanner(System.in);
        int largoArreglo;

        System.out.print("Ingrese lo largo del arreglo: ");
        largoArreglo = Integer.parseInt(consola.nextLine());

        int [] numeros = new int[largoArreglo];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese valor para posicion " +i+ " :");
            numeros[i] = Integer.parseInt(consola.nextLine());
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println("La posicion " +i+ " tiene el valor: " +numeros[i]);
        }
    }

    public static void metodoEjercicioArray03(){
        // Sistema de calificaciones.

        Scanner consola = new Scanner(System.in);
        int totalCalificaciones;
        double promedio = 0;
        double sumaCalificaciones = 0;

        System.out.print("Cuantas calificaciones desea ingresar: ");
        totalCalificaciones = Integer.parseInt(consola.nextLine());

        int [] calificaciones = new int[totalCalificaciones];

        for (int i = 0; i < calificaciones.length; i++){
            System.out.print("Ingrese calificacion " +i+ " :" );
            calificaciones[i] = Integer.parseInt(consola.nextLine());
            sumaCalificaciones += calificaciones[i];
        }
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println("Calificacion " +i+ " es: " +calificaciones[i]);
        }
        promedio = sumaCalificaciones / totalCalificaciones;
        System.out.print("El promedio es: " +promedio);
    }

// Una Matriz es un arreglo en dos dimenciones. ------------------------------------------------------------------------

    public static void metodoEjercicioMatriz01(){
        // Ingresar e imprimir datos matriz.

        Scanner consola = new Scanner(System.in);
        int columnas, renglones;

        System.out.print("Ingrese numero de renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese numero de columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        int[][] matriz01 = new int[renglones][columnas];

        for (int i = 0; i < renglones; i++) {
            for (int x = 0; x < columnas; x++) {
                System.out.print("Ingrese valor para posicion " + i + " ," + x + " :");
                matriz01[i][x] = Integer.parseInt(consola.nextLine());
            }
        }
        for (int i = 0; i < renglones; i++) {
            for (int x = 0; x < columnas; x++) {
                System.out.println("La posicion " + i + " ," + x + " tiene el valor: " + matriz01[i][x]);
            }
        }
    }

    public static void metodoEjercicioMatriz02(){
        // Ejercico Suma Diagonal Matriz.

        int suma = 0;
        int[][] matriz02 = new int[3][3];
        matriz02[0][0] = 100;
        matriz02[0][1] = 200;
        matriz02[0][2] = 300;
        matriz02[1][0] = 400;
        matriz02[1][1] = 500;
        matriz02[1][2] = 600;
        matriz02[2][0] = 700;
        matriz02[2][1] = 800;
        matriz02[2][2] = 900;

        for (int i = 0; i < matriz02.length; i++) {
            for (int x = 0; x < matriz02.length; x++) {
                System.out.println("La posicion " + i + " ," + x + " tiene el valor: " + matriz02[i][x]);
                if (i == x){
                    suma += matriz02[i][x];
                }
            }
        }
        System.out.println("La suma es: " +suma);
    }
}
