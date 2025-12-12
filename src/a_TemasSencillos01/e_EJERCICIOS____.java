package a_TemasSencillos01;
import java.util.Scanner;

// Ejercicios usando Estructuras De Control (if-else) trabajan con valores Boleanos, excepto (switch).

public class e_EJERCICIOS____ {

    // Como no tenemos algun ciclo, solamente se ejecutara una vez.

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;

        System.out.println("Estructuras De Control (if-else / switch) con operadores.                      ");
        System.out.println("1. Ejercicio Login,                           con if-else y operador logico && ");
        System.out.println("2. Ejercicio Vacaciones o diaDescanso,        con if-else y operador logico || ");
        System.out.println("3. Ejercicio Salir del Sistema,               con if-else y operador logico !  ");
        System.out.println("4. Ejercicio Mayor de 2 numeros,              con if-else y operador relacional >  ");
        System.out.println("5. Ejercicio Mayor 18 años,                   con if-else y operador relacional >= ");
        System.out.println("6. Ejercicio Sistema Calificaciones,          con if-else y operador logico && con relacional >= ");
        System.out.println("7. Ejercicio Identificar estacion por el mes, con if-else y operador logico || con relacional == ");
        System.out.println("8. Ejercicio Identificar estacion por el mes, con switch");
        System.out.println("Escoja cual desea ejecutar: ");
        opcion = Integer.parseInt(consola.nextLine());

        switch (opcion){
            case 1:
                metodoEjercicio01();
                break;
            case 2:
                metodoEjercicio02();
                break;
            case 3:
                metodoEjercicio03();
                break;
            case 4:
                metodoEjercicio04();
                break;
            case 5:
                metodoEjercicio05();
                break;
            case 6:
                metodoEjercicio06();
                break;
            case 7:
                metodoEjercicio07();
                break;
            case 8:
                metodoEjercicio08();
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    //Ejercicio con Estructura De Control (if) y operador logico &&.
    public static void metodoEjercicio01() {
        //Login.

        Scanner consola = new Scanner(System.in);

        String usuarioValido = "admin";
        String passwordValido = "123";
        String usuario;
        String password;

        System.out.println("Ingrese usuario");
        usuario = consola.nextLine();
        System.out.println("Ingrese password");
        password = consola.nextLine();

        // equals es como si usaramos un operador de relacion (==) que nos da un valor booleano
        // para despues trabajar con el operador logico (&&) que tmb devuelve un valor booleano para que la Sentencia De Decicion trabaje.
        if (usuario.equals(usuarioValido) && password.equals(passwordValido)) {
            System.out.println("Ingresando");
        } else if (usuario.equals(usuarioValido) && !password.equals(passwordValido)) {
            System.out.println("Password incorrecto");
        } else if (!usuario.equals(usuarioValido) && password.equals(passwordValido)) {
            System.out.println("Usuario incorrecto");
        } else {
            System.out.println("Ambos valores incorrectos");
        }
    }

    //Ejercicio con Estructura De Control (if) y operador logico ||.
    public static void metodoEjercicio02() {
        // Vacaciones o diaDescanso.

        Scanner consola = new Scanner(System.in);
        boolean diaDescanso, vacaciones;

        System.out.println("Trabaja hoy? ");
        diaDescanso = Boolean.parseBoolean(consola.nextLine());
        System.out.println("Tiene vacaciones hoy? ");
        vacaciones = Boolean.parseBoolean(consola.nextLine());

        if (diaDescanso || vacaciones) {
            System.out.println("Si puedo asistir");
        } else {
            System.out.println("No puedo asistir");
        }
    }

    //Ejercicio con Estructura De Control (if) y operador logico !.
    public static void metodoEjercicio03() {
        //Salir de un sistema.

        Scanner consola = new Scanner(System.in);
        boolean salirSistema;

        System.out.println("Desea salir del sistema? ");
        salirSistema = Boolean.parseBoolean(consola.nextLine());

        if (!salirSistema) {
            System.out.println("Seguir en el sistema");
        } else {
            System.out.println("Saliendo del sistema");
        }

        //Sin usar operador NOT !  --------------------
        if (salirSistema) {
            System.out.println("Saliendo del sistema");
        } else {
            System.out.println("Seguir en el sistema");
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    //Ejercicio con Estructura De Control (if) y operador relacional >.
    public static void metodoEjercicio04() {
        // Mayor de dos numeros.

        Scanner consola = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese numero 1 ");
        num1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese numero 2 ");
        num2 = Integer.parseInt(consola.nextLine());

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else {
            System.out.println("El numero mayor es: " + num2);
        }

        //Operador Ternario (Es una simplificacion del if-else).  Compara una exprecion Boleana.
        System.out.println(num1 > num2 ? num1 : num2);
    }

    //Ejercicio con Estructura De Control (if) y operador relacional >=.
    public static void metodoEjercicio05() {
        //Mayor 18 años.

        Scanner consola = new Scanner(System.in);
        final int MAYOR_EDAD = 18;
        int edad;
        System.out.println("Ingresa tu edad");
        edad = Integer.parseInt(consola.nextLine());

        if (edad >= MAYOR_EDAD) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    //Ejercicio con Estructura De Control (if) y operador logico && con relacional >=.
    public static void metodoEjercicio06() {
        //Sistema de calificaciones.

        System.out.println("Ingrrese tu calificacion");
        var calificacion = Integer.parseInt(new Scanner(System.in).nextLine());

        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Tu calificacion es A");
        } else if (calificacion >= 8 && calificacion <= 9) {
            System.out.println("Tu calificacion es B");
        } else if (calificacion >= 7 && calificacion <= 8) {
            System.out.println("Tu calificacion es C");
        } else if (calificacion >= 6 && calificacion <= 7) {
            System.out.println("Tu calificacion es D");
        } else if (calificacion >= 0 && calificacion <= 6) {
            System.out.println("Estas reprovado");
        } else {
            System.out.println("Valor invalido");
        }
    }

    //Ejercicio con Estructura De Control (if) y operador logico || con relacional ==.
    public static void metodoEjercicio07() {
        //Identificar estacion del año segun el mes.

        Scanner consola = new Scanner(System.in);
        int mes;
        System.out.println("Ingrese el mes");
        mes = Integer.parseInt(consola.nextLine());

        if (mes == 1 || mes == 2 || mes == 12) {
            System.out.println("Invierno");
        } else if (mes == 3 || mes == 4 || mes == 5) {
            System.out.println("Primavera");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("Verano");
        } else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("Otoño");
        } else {
            System.out.println("Mes desconocido, incorrecto");
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    //Ejercicio con Estructura De Control (switch).
    public static void metodoEjercicio08() {
        //Identificar estacion del año segun el mes.

        Scanner cosola = new Scanner(System.in);
        int mes;

        System.out.println("Ingrese el mes");
        mes = Integer.parseInt(cosola.nextLine());

        switch (mes) {
            case 1, 2, 12:
                System.out.println("Invierno");
                break;
            case 3, 4, 5:
                System.out.println("Primavera");
                break;
            case 6, 7, 8:
                System.out.println("Verano");
                break;
            case 9, 10, 11:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Mes desconocido");
        }

        // Desde java 14 se puede usar ->  (Ya sin poner break) pero solamente si hay una linea de codigo.
        switch (mes){
            case 1, 2, 12 -> System.out.println("Invierno");
            case 3, 4, 5 -> System.out.println("Primavera");
            case 6, 7, 8 -> System.out.println("Verano");
            case 9, 10,11 -> System.out.println("Otoño");
            default -> System.out.println("Mes desconocido");
        }
    }




}
