package a_TemasSencillos03;

// Un método es una acción que un Objeto o Clase puede realizar.
// Bloque de codigo reutilizable, que realiza una operacion en particular.
// Puede que tenga parametros de entrada y tambien puede que de salida.
// Sirve para organizar, reutilizar y modularizar el código, haciendo los programas más fáciles de entender y mantener.



// La estructura de un metodo es la siguiente:
// Se le conoce tambien como la firma del método.

// Modificador.     Controlan quién puede usar un método desde otras partes del programa o desde otras clases.
//      private.    El método puede ser usado dentro de la misma clase donde fue declarado. (Nadie fuera de esa clase puede usarlo.)
//      protected.  El método puede ser usado dentro de la misma clase, en sus subclases (herencia) y en el mismo paquete. (Es un punto medio entre public y private).
//      public.     El método puede ser usado desde cualquier parte del programa, incluso desde otras clases o paquetes. (el mas abierto).
//      Nada.       El método puede ser usado dentro del mismo paquete.

// Static o Dinamico.
//      Static.     Pertenece a la  clase,  y se accede desde la clase.     Se comparte entre todos.    Algo Static no puede acceder algo Dinamico, porque no se a creado.
//      Dinamico.   Pertenece al    objeto, y se accede desde el objeto.                                Algo Dinamico si puede accer algo Static, porque ya esta creado.

// Retorno.         El tipo de dato que devuelve el método.
//      void.       No devuelve nada.
//      int.        Devuelve enteros.
//      double.     Devuelve con punto decimal.
//      String.     Devuelve cadenas.
//      Bolean.     Devuelve boleanos.

// Nombre Metodo.   El nombre que le pongas al metodo.

// Parametros.      El metodo a veces necesita valores para funcionar que se reciben, llamados (parametros).





// La sobrecarga de metodos es cuando usas el mismo nombre, pero con direfentes parametros. Crear un metodo de distintas formas.
// Argumentos
// Objetos
// Var Args

// var args

// Pasar multiples parametros a un metodo.  Sin especificar cuantos argumentos mandas.

// El metodo puede recibir cualquier cantidad de parametros.

public class a_Metodos {

    // Metodo Main.
    public static void main(String[] args) {

        // Llaman a metodo01 y reutilizan codigo del metodo.
        metodo01(25);    // Argumento, lo que mandas.
        metodo01(50);    // Argumento, lo que mandas.
        metodo01(1000, 2000);   // Argumento, lo que mandas. Sobre carga del metodo.


        // Llaman a metodo02 y reutilizan codigo del metodo.
        int resultado;
        resultado = metodo02(10, 20);       // Argumento, lo que mandas.
        System.out.println("La suma es: " +resultado);
        resultado = metodo02(100, 400);     // Argumento, lo que mandas.
        System.out.println("La nueva suma es: " +resultado);

        // Var Args.
        metodonumeros(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }




    // Metodo no retorna nada, void.
    public static void metodo01(int numero){                    // Parametro, lo que recibimos.
        System.out.println("El numero es: " +numero);
    }
    public static void metodo01(int numero01, int numero02){    // Parametro, lo que recibimos.     Sobrecarga de metodo.
        System.out.println("Los numeros son: " +numero01+ " y " +numero02);
    }


    // Metodo retorna entero, int.
    public static int metodo02(int num1, int num2){ // Parametro, lo que recibimos.
        int suma = num1 + num2;
        return suma;
    }

    public static void metodonumeros(int... numeros){       // De manera interna se convierte un un arreglo.
//        for (int i = 0; i < numeros.length; i++){
//            System.out.print(numeros[i] +" ");
//        }
        for (int num : numeros){
            System.out.println(num);
        }
    }


}
