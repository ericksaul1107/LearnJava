package b_TemasAvanzados03;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class b_MetodosIncluidos {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        boolean salir = false;

        do {
            int opcion;

            System.out.println("Ejercicios.");
            System.out.println("1. Metodo recursivo");
            System.out.println("2. Metodo es par?");
            System.out.println("3. Metodo Obtener Largo y cada caracter String");
            System.out.println("4. Metodo Extraer Subcadena");
            System.out.println("5. Metodo Numero Aleatorio");
            System.out.println("6. Metodo Numero Redondeado");
            System.out.println("7. Metodo Ejercicio Generador Id");
            System.out.println("8. Metodo Ejercicio Generador nuevo email");
            System.out.println("9. Salir.");
            System.out.print("Elija una opcion: ");
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("Metodo recursivo");
                    metodoRecursivo(8);     // Argumento, lo que mandas.
                    break;
                case 2:
                    System.out.println("Metodo es par?");
                    System.out.print("Ingrese un numero para ver si es par: ");
                    int num = Integer.parseInt(consola.nextLine());
                    boolean resultado = metodoEjercicioEsPar(num);     // Argumento, lo que mandas.
                    System.out.println("¿El numero es par? " +resultado);
                    break;
                case 3:
                    System.out.println("Metodo Obtener Largo String");
                    metodoObtenerLargoString();
                    break;
                case 4:
                    System.out.println("Metodo Extraer Subcadenas");
                    metodoExtraerSubcadenas();
                    break;
                case 5:
                    System.out.println("Metodo Numero Aleatorio");
                    metodoNumeroAleatorio();
                    break;
                case 6:
                    System.out.println("Metodo Numero Redondeado");
                    metodoNumeroRedondeo();
                    break;
                case 7:
                    System.out.println("Metodo Ejercicio 01");
                    metodoEjercicio01();
                    break;
                case 8:
                    System.out.println("Metodo Ejercicio 02");
                    metodoEjercicio02();
                    break;
                case 9:
                    System.out.println("Saliendo del sistema");
                    salir = true;
            }
        }   while (!salir);
    }

    // Metodo Recursivo. -----------------------------------------------------------------------------------------------

    // 1. Se debe llamar a si mismo.
    // 2. Debe avanzar hacia un caso base, de lo contrario caemos en repeticiones infinitas.    Con cada llamada recursiva nos acercamos al caso base (Se le va eliminando un numero).

    public static void metodoRecursivo(int numero){     // Parametro, lo que recibimos.
        if (numero == 1){
            System.out.println(numero);
        }   else {
            System.out.print(numero+ " ");
            metodoRecursivo(numero - 1);    // Argumento, lo que mandas.       Aquí ya mandamos el valor menos 1.
        }
    }

    // -----------------------------------------------------------------------------------------------------------------

    public static boolean metodoEjercicioEsPar(int numero){
        // Es numero par?

        if (numero % 2 == 0 ){
            return true;
        }   else {
            return false;
        }
    }

    // -----------------------------------------------------------------------------------------------------------------

    // Metodos ya incluidos en paquete java.util.

    // Clase String                                                                         String nombre = Erick Saul;
    //      .length()           Obtener el largo de una cadena. (Hasta espacios).                   System.out.print(nombre.length());
    //      .charAt(i)          Obtener el carácter en una posición específica de una cadena.  For  System.out.print(i+ " :" +nombre.charAt(i));
    //      .subString(0,0)     Obtener una sub cadena de la principal.                             System.out.print(nombre.substring(0,4));
    //      .toUpperCase()      Convertir a mayusculas.                                             System.out.print(nombre.toUpperCase());
    //      .toLowerCase()      Convertir a minusculas.                                             System.out.print(nombre.toLowerCase());
    //      .indexOf()          En que posicion aparece por primera vez un caracteer.               System.out.print(nombre.indexOf("i");
    //      .lastIndexOf()      En que posicion aparece por ultima vez un caracteer.                System.out.print(nombre.lastIndexOf("i");
    //      .trim()             Eliminar espacios en blanco, antes y despues del string.            System.out.print(nombre.trim();
    //      .replace()          Cambiar caracteres por otros. (todos las "a" que sean "o".          System.out.print(nombre.replace("a", "o");


    // Clase Math   (Poner Clase Math)  Metodo Static.              double numero = 38.4382;
    //      .round()            Redondear un numero decimal.        double redondeo = Math.round(numero);


    // Clase Random (Crear Objeto)                                  Random aleatorio = new Random();
    //      .nextInt(0, 0)      Obtener numero aleatorio.           int valorAleatorio = aleatorio.nextInt(limite+1);






    // ---------------------------------------------------
    // Metodos que quiero aprender.

    // .chars
    // .sorted
    // .toArray

    public static void metodoObtenerLargoString(){
        // Largo y caracter de cadena.

        // Obtener Largo String.            .length()
        // Obtener Caracteres String.       .charAt()

        Scanner consola = new Scanner(System.in);
        String nombre;

        System.out.println("Ingrese un nombre");
        nombre = consola.nextLine();

        System.out.println("El largo del String (nombre) es: " +nombre.length());

        for (int i = 0; i < nombre.length(); i++){
            System.out.println(i+ " :" +nombre.charAt(i));
        }
    }

    public static void metodoExtraerSubcadenas(){
        // Extraer Subcadenas.      .substring(0, 0)

        String cadena = "Hola Mundo";
        System.out.println("Cadena: " +cadena);

        String subCadena01;
        String subCadena02;

        subCadena01 = cadena.substring(0, 4);   // Se le agrega +1 al indice final.
        System.out.println("SubCadena01: " +subCadena01);
        subCadena02 = cadena.substring(5, 10);
        System.out.println("SubCadena02: " +subCadena02);
    }

    public static void metodoNumeroAleatorio(){
        // Numero Aleatorio.        Objeto de clase Random con metodo .nextInt

        Scanner conosola = new Scanner(System.in);

        System.out.print("Ingrese hasta que limite quiere su numero aleatorio:");
        int limite = Integer.parseInt(conosola.nextLine());

        Random aleatorio = new Random();    // Usando la clase ramdom, creamos un objeto.

        //                     Metodo .nexInt genera el numero aleatorio.
        int valorAleatorio = aleatorio.nextInt(limite+1);  // Al general un numero, no se incluye el valor final.  Si queremos incluirlo, sumarle uno. (Ya toma en cuenta inicio 0).
        System.out.println("Numero aleatorio es: " +valorAleatorio);
    }

    public static void metodoNumeroRedondeo(){
        // Numero Redondeado.       Clase Math metodo .round()

        Scanner conosola = new Scanner(System.in);

        System.out.print("Ingrese numero decimal para redondearlo: ");
        double numero = Double.parseDouble(conosola.nextLine());

        //              Math.round   Clase Math y metodo round para redondear.
        double redondeo = Math.round(numero);
        System.out.println(numero+ " se redondea a: " +redondeo);

        String patron = "#.##";
        DecimalFormat formato = new DecimalFormat(patron);
        String numeroYaConFormato = formato.format(numero);
        System.out.println(numero+ " con formato es: " +numeroYaConFormato);
    }






    // Ejercicios

    public static void metodoEjercicio01(){
        // Generador de Id.

        // Leer consola         con   Objeto clase Scanner y metodo .nextLine()
        // Hacer subcadena      con   .substring(0,0)
        // Convertir mayusculas con   .toUpper()

        // Valor aleatorio      con   Objeto clase Random  y metodo .nextInt(0, 0)

        Scanner conosola = new Scanner(System.in);

        String nombre, apellido, año, id;
        int valorAleatorio;

        System.out.println("Ingrese nombre");
        nombre = conosola.nextLine().substring(0, 2).toUpperCase();
        System.out.println("Ingrese apellido");
        apellido = conosola.nextLine().substring(0, 2).toUpperCase();
        System.out.println("Ingrese año");
        año = conosola.nextLine().substring(2, 4).toUpperCase();

        Random aleatorio = new Random();
        valorAleatorio = aleatorio.nextInt(1000, 9999+1);
        System.out.println("Numero aleatorio es: " +valorAleatorio);

        id = nombre + apellido + año + valorAleatorio;
        System.out.println("Su nuevo id es: " +id);
    }

    public static void metodoEjercicio02(){
        // Generador email.

        // Converir minusculas  con   .toLowerCase

        Scanner conosola = new Scanner(System.in);

        String nombre, apellido;
        String dominio = "@empresa.com";

        System.out.print("Ingrese su nombre: ");
        nombre = conosola.nextLine().toLowerCase();
        System.out.print("Ingrese su apellido: ");
        apellido = conosola.nextLine().toLowerCase();


        String nuevoCorreo = nombre + apellido + dominio;

        System.out.println("Tu nuevo correo es: " +nuevoCorreo);
    }


}


