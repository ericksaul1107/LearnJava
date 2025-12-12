package a_TemasSencillos00;
import java.util.Scanner;

// Simbolos que indican cómo se manipulan los datos.

//  OPERADORES ARITMETICOS.                                 1. [] ()    Parentesis y corchetes.
//              *     Multiplicación                        2. ++ --    Unitarios.
//              /     Division                              3. * / %    Aritmeticos.
//              %     Modulo(Resto)                         4. + -      Aritmeticos.
//              +     Suma                                  5. > >=     Relacionales.
//              -     Resta                                 6. == !=    Relacionales.
//                                                          7. && || !  Logicos.
//  OPERADORES ASIGNACION.                                  8. *= +=    Asignacion.
//              =       Asignación
//              +=      Suma y asigna
//              -=      Resta y asigna
//              *=      Multiplica y asigna
//              /=      Divide y asigna
//              %=      Modulo y asigna

//  OPERADORES RELACION (Devuelve true / false).
//              ==      Igual a
//              !=      Distinto a
//              >       Mayor que
//              >=      Mayor o igual que
//              <       Menor que
//              <=      Menor o igual que

//  OPERADORES LOGICOS (Devuelve true / false)  (Para programar con estos tambien necesitamos de un valor booleano).
//              AND &&     -  True si ambas condiciones son verdaderas.
//              OR  ||     -  True si al menos una condicion es verdadera.
//              NOT  !     -  Invierte el valor boolean.    (Solo usa un operando).

//  OPERADOES INCREMENTO/DECREMENTO
//              ++      Incrementa en 1
//              --      Decrementa en 1

public class b_Operadores {

    public static void main(String[] args) {
        metodoIncremetoDecremento();
    }

    public static void metodoAritmetico(){
        Scanner con = new Scanner(System.in);

        int valor1;
        int valor2;
        int resultado;

        System.out.println("Ingrese primer valor");
        valor1 = Integer.parseInt(con.nextLine());
        System.out.println("Ingrese segundo valor");
        valor2 = Integer.parseInt(con.nextLine());

        resultado = valor1 + valor2;
        System.out.println("La suma es: " +resultado);

        resultado = valor1 - valor2;
        System.out.println("La resta es: " +resultado);

        resultado = valor1 * valor2;
        System.out.println("La multiplicacion es: " +resultado);

        resultado = valor1 / valor2;
        System.out.println("La division es: " +resultado);

        resultado = valor1 % valor2;
        System.out.println("El residuo es: " +resultado);
    }

    public static void metodoAsignacion(){
        int miNumero = 20;

        //Se le hace la operancion y se le asigna al momento a la misma variable.

        //miNumero = miNumero + 5;
        miNumero += 5;
        System.out.println("miNumero: " +miNumero);

        //miNumero = miNumero - 2;
        miNumero -= 2;
        System.out.println("miNumero: " +miNumero);

        //miNumero = miNumero * 2;
        miNumero *= 2;
        System.out.println("miNumero: " +miNumero);

        //miNumero = miNumero / 2;
        miNumero /= 2;
        System.out.println("miNumero: " +miNumero);
    }

    public static void metodorRelacion(){
        int a = 5;
        int b = 10;
        boolean resultado;

        //Devuelve valor boolenano (True / False).

        //Igual?
        resultado = a == b;
        System.out.println("a == b: " +resultado);

        //Distinto?
        resultado = a != b;
        System.out.println("a != b: " +resultado);

        //Mayor que?
        resultado = a > b;
        System.out.println("a > b: " +resultado);

        //Mayor o igual que?
        resultado = a >= b;
        System.out.println("a >= b: " +resultado);

        //Menor que?
        resultado = a < b;
        System.out.println("a < b: " +resultado);

        //Menor o igual que?
        resultado = a <= b;
        System.out.println("a <= b: " +resultado);
    }

    //Trabaja con valores boleanos y tambien devuelve valores boleanos.
    public static void metodoLogico(){
        boolean a = true;
        boolean b = false;
        boolean resultado;

        //True si ambas condiciones son verdaderas.
        resultado = a && b;
        System.out.println("El resultado AND: " +resultado);

        //True si al menos una condicion es verdadera.
        resultado = a || b;
        System.out.println("El resultado OR: " +resultado);

        //Invierte el valor boolean.    (Solo usa un operando).
        resultado = !b;
        System.out.println("El resultado NOT: " +resultado);

        //  ------------------------------------------------------------
        //  Comprovar si un numero esta dentro del rango asignado.

        Scanner consola = new Scanner(System.in);

        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 10;
        boolean valorDentroDeRango;

        int valor;

        System.out.println("Ingrese un valor: ");
        valor = Integer.parseInt(consola.nextLine());

        // Aqui trabajamos primero con operadores de relacion que nos devuelven un valor booleano
        // y despues con operador logico (&&) que trabaja con operadores booleanos..

        //                     True/False          &&    True/False
        valorDentroDeRango = valor >= VALOR_MINIMO && valor <= VALOR_MAXIMO;
        System.out.println("Valor dentro de rango? " +valorDentroDeRango);

        // --------------------------------------------------------

        //Usamos lo mismo pero con Sentencia De Decicion (if).

        if (valor >= VALOR_MINIMO && valor <= VALOR_MAXIMO){
            System.out.println("Valor dentro de rango");
        }   else {
            System.out.println("Valor fuera de rango");
        }
    }

    public static void metodoIncremetoDecremento(){
        int resultado;

        int a = 5;
        //Pre-Incremento.    Suma antes.
        resultado = ++a;
        System.out.println("Pre-incremento: " +resultado);

        //Post-Incremento.   Suma despues.      Cuando vuelvas a usar la variable se le añade el incremento.
        resultado = a++;
        System.out.println("Primera vez Post-incremento: " +resultado);
        System.out.println("Segunda vez Post-Incremento: " +a);



        int c = 15;
        //Pre-Decremento.    Resta antes.
        resultado = --c;
        System.out.println("Pre-decremento: " +resultado);

        //Post-Decremento.   Resta despues.     Cuando vuelvas a usar la variable se le añade el decremento.
        resultado = c--;
        System.out.println("Primera vez Post-decremento: " +resultado);
        System.out.println("Segunda vez Post-decremento: " +c);
    }


}
