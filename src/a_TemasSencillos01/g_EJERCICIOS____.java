package a_TemasSencillos01;
import java.util.Scanner;

public class g_EJERCICIOS____ {

    // Ejercicios usando ciclos (for, while y do-while) junto con estructuras de control (switch) y en algun caso .

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        while (!salir){
            System.out.println("1. Ejercicio Suma Acumulativa, con For");
            System.out.println("2. Ejercicio Suma Acumulativa, con While");
            System.out.println("3. Ejercicio Suma Acumulativa, con Do While");
            System.out.println("4. Ejercicio Menu Sencillo,    con Do While y Switch");
            System.out.println("5. Ejercicio Menu ATM,         con Do While y if-else con Switch");
            System.out.println("6. Ejercicio Menu Calculadora, con Do While y if-else con Switch");
            System.out.println("7. Salir");
            System.out.print("Escoja cual desea ejecutar: ");
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("MetodoEjercicio01: Suma Acumulativa con For");
                    metodoEjercicio01();
                    break;
                case 2:
                    System.out.println("MetodoEjercicio02: Suma Acumulativa con While");
                    metodoEjercicio02();
                    break;
                case 3:
                    System.out.println("MetodoEjercicio03: Suma Acumulativa con Do While");
                    metodoEjercicio03();
                    break;
                case 4:
                    System.out.println("MetodoEjercicio04: Menu Sencillo con Switch");
                    metodoEjercicio04();
                    break;
                case 5:
                    System.out.println("MetodoEjercicio05: Menu ATM con Switch");
                    metodoEjercicio05();
                    break;
                case 6:
                    System.out.println("MetodoEjercicio06: Menu Calculadora con Switch");
                    metodoEjercicio06();
                    break;
                case 7:
                    System.out.println("Saliendo de los ejercicios");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    // Realizar la suma   1 + 2 + 3 + 4 + 5 = 15
    //                      3   + 3
    //                          6   + 4
    //                            10    + 5
    //                                15

    public static void metodoEjercicio01(){
        //Suma Acumulativa con for.

        final int MAXIMO = 5;
        int suma = 0;

        for (int i = 1; i <= MAXIMO; i++){
            suma += i;
        }
        System.out.println("La suma acumulativa con For: " +suma);
    }

    public static void metodoEjercicio02(){
        // Suma acumulativa con while.

        final int MAXIMO = 5;
        int suma = 0;
        int i = 0;

        while (i <= MAXIMO){
            suma += i;
            i++;
        }
        System.out.println("La suma acumulativa con While: " +suma);
    }

    public static void metodoEjercicio03(){
        // Suma acumulativa con do while.

        final int MAXIMO = 5;
        int suma = 0;
        int i = 0;

        do {
            suma += i;
            i++;
        }   while (i <= MAXIMO);
        System.out.println("La suma acumulativa con Do While: " +suma);
    }

    // -----------------------------------------------------------------------------------------------------------------

    public static void metodoEjercicio04(){
        // Menu Sencillo.

        Scanner consola = new Scanner(System.in);
        int menu = 0;
        boolean salir = false;

        do {
            System.out.println("1. Crear cuenta nueva");
            System.out.println("2. Eliminar cuenta");
            System.out.println("3. Salir del sistema");
            System.out.print("Escoja una opcion: ");
            menu = Integer.parseInt(consola.nextLine());

            switch (menu){
                case 1:
                    System.out.println("Creando cuenta");
                    break;
                case 2:
                    System.out.println("Eliminando cuenta");
                    break;
                case 3:
                    System.out.println("Saliendo del menu");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }   while (!salir); //Se iterara hasta que sea falso.
    }

    public static void metodoEjercicio05(){
        //Menu ATM.

        Scanner consola = new Scanner(System.in);
        Double saldo = 500.00;
        int menu;
        boolean salir = false;
        String usuarioValido = "Erick", usuario, contraseñaValida = "123", contraseña;

        System.out.print("Ingrese usuario");
        usuario = consola.nextLine();
        System.out.print("Ingrese contraseña");
        contraseña = consola.nextLine();

        if (usuario.equals(usuarioValido) && contraseña.equals(contraseñaValida)){
            do {
                System.out.println("1. Depositar");
                System.out.println("2. Retirar");
                System.out.println("3. Consultar saldo");
                System.out.println("4. Salir");
                System.out.print("Escoja una opcion: ");
                menu = Integer.parseInt(consola.nextLine());

                switch (menu){
                    case 1:
                        System.out.println("¿Cuanto dinero quiere depositar?");
                        var deposito = Double.parseDouble(consola.nextLine());
                        saldo += deposito;
                        System.out.println("Su saldo ahora es de: " +saldo);
                        break;
                    case 2:
                        System.out.println("¿Cuanto dinero quiere retirar?");
                        var retiro = Double.parseDouble(consola.nextLine());
                        if (retiro <= saldo){
                            saldo -= retiro;
                            System.out.println("Su saldo ahora es de: " +saldo);
                        }   else {
                            System.out.println("Dinero insuficiente, tu cuenta tiene: " +saldo);
                        }
                        break;
                    case 3:
                        System.out.println("Su saldo es de: " +saldo);
                        break;
                    case 4:
                        System.out.println("Saliendo del ATM");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            }   while (!salir); //NOT !   Invierte el valor.
        }   else if (!usuario.equals(usuarioValido) && contraseña.equals(contraseñaValida)) {
            System.out.println("Usuario incorrecto");
        }   else if (usuario.equals(usuarioValido) && !contraseña.equals(contraseñaValida)){
            System.out.println("Contraseña incorrecta");
        }   else {
            System.out.println("Datos incorrectos");
        }


    }

    public static void metodoEjercicio06(){
        // Menu Calculadora.

        Scanner consola = new Scanner(System.in);
        int menu;
        boolean salir = false;
        double numero1 = 0.0, numero2 = 0.0, resultado;

        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Escoja una opcion");
            menu = Integer.parseInt(consola.nextLine());

            //Si se elije alguna operacion, se piden los 2 valores.
            if (menu >= 1 && menu <= 4){
                System.out.println("Ingresa valor 1");
                numero1 = Double.parseDouble(consola.nextLine());
                System.out.println("Ingresa valor 2");
                numero2 = Double.parseDouble(consola.nextLine());
            }

            switch (menu){
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("La suma es: " +resultado);
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("La resta es: " +resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("La multiplicacion es: " +resultado);
                    break;
                case 4:
                    if (numero2 > 0){
                        resultado = numero1 / numero2;
                        System.out.println("La division es: " +resultado);
                    }   else {
                        System.out.println("No se puede dividir");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de calculadora");
                    salir = true;
                default:
                    System.out.println("Opcion invalida");
            }
        }   while (!salir);
    }





}
