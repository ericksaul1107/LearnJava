package a_TemasSencillos00;
import java.util.Scanner;

//  bit - 0 y 1      byte - 8 bits      kilobyte - 1.024 bytes      megabyte 1,204 kilobytes      gigabyte - 1,024 megabytes

// var     -  Es mas generico, toma el tipo de dato que es la variable. Siempre hay que inicializarla y se usa cuando conocemos el tipo de dato que vamos a usar.
// final   -  Es una CONSTANTE y el valor que le pongas ya no cambia, siempre se pone en mayusculas.


// Modificadores de acceso. Desde donde puede ser accedido.
//      private.        Solo puede ser usado dentro de la misma clase donde fue declarado. (Nadie fuera de esa clase puede usarlo.)
//      protected.      Solo puede ser usado dentro de la misma clase, en sus subclases (herencia) y en el mismo paquete. (Es un punto medio entre public y private).
//      public.         Solo puede ser usado desde cualquier parte del programa, incluso desde otras clases o paquetes. (el mas abierto).


//  Las variables se dividen en 2 grupos.
//      PRIMITIVOS
//              byte    -  1 byte  (8 bits)
//              short   -  2 bytes (16 bits)
//              int     -  4 bytes (32 bits)
//              long    -  8 bytes (64 bits)
//              float   -  4 bytes (32 bits)
//              double  -  8 bytes (64 bits)
//              char    -  2 bytes (16 bits)
//              boolean -  1 byte  (8 bits)
//      REFERENCIA (Object)
//             String   -  Texto
//             Array    -  Conjunto de valores
//             Clases   -  Clases
//             Interfaces


//  Despues se dividen por el alcance que tienen.
//          LOCAL.
//              Se declaran dentro de un metodo o bloque.
//              Solo exiten mientras se ejecuta esa parte.

//      Para acceder ->
//          INSTANCIA.  Se accede por Objeto.
//              Se declaran en la clase, fuera de metodos.
//              Cada objeto tiene su propia copia de la variable.
//              Pertenecen a los objetos.

//          STATIC.     Se accede por Clase.
//              Se declaran en la clase con la palabra static al principio.
//              Hay una sola copia compartida entre los objetos.
//              Pertenece a la clase, no a los objetos, se puede llamar sin la necesidad de tener un objeto.
//              Se puede llamar solo con poner el nombre de la clase (nombreClase.variable)


public class a_Variables {

    //Variables de instancia (Pertenece a los objetos).
    String apellido = "Rosales";
    String apellido2 = "De la Mora";
    final double MI_CONSTANTE = 3.141516;   //Variable CONSTANTE

    //Variable Static (Pertenece a la clase).
    static int curp = 82324;

    public static void main(String[] args) {
        a_Variables.curp = 545; //Cambiamos contenido de la variable Static con el nombre de la clase y nombre de la variable (Variables.curp)

        metodoVariables();
        metodoScanner();
        metodoConvercionDatos();
    }

    public static void metodoVariables(){

        //Variables locales (Dentro de un metodo)
        var ine = 2743536;
        String nombre = "Erick Saul";
        int edad = 23;
        double sueldo = 20500.50;
        boolean vive = true;

        //Concatenación
        System.out.println(nombre+ " gana " +sueldo+ " tiene " +edad+ " años de edad y su ine es " +ine+ ". Esta vivo? " +vive);
        System.out.println("Su curp es: " +curp);     //Llamamos a la variable Static que esta fuera del metodo pero si dentro de la clase.

        //No podemos solo llamar a una variable de instancia dentro de un metodo porque estan afuera.
        //System.out.println("Llamar variable de instancia: " +apellido);  Errorrr

        //Cada objeto tiene su copia de la variable de instancia, podemos modificarla para cada objeto o simplemente usarla con el contenido que ya tiene.  (Una Plantilla)
        a_Variables p1 = new a_Variables();
        System.out.println("Su primer apellido es: " +p1.apellido+ " y su segundo appelido es " +p1.apellido2);    //LLamamos solo a la variable.

        a_Variables p2 = new a_Variables();
        p2.apellido = "Garcia";     //Cambiamos el valor de la variable, o sea su copia porque es otro objeto.
        p2.apellido2 = "Orozco";
        System.out.println("Primer apellido de segunda persona es: " +p2.apellido+ " y su segundo apellido es:" +p2.apellido2);

        System.out.println("Mi constante es: " +p2.MI_CONSTANTE);   //Podemos usar esta variable porque es de instancia, tenemos una copia, pero tenemos que usarla de por medio con el objeto.
    }                                                               //Pero no modificarla porque es CONSTANTE (final)

    public static void metodoScanner(){
        //Clase Scanner, importada desde un paquete. Un paquete contiene varias clases.
        Scanner consola = new Scanner(System.in); //Creamos un objeto de la clase Scanner y (in) es para la entrada de datos.

        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = consola.nextLine();              //Usamos nuestro objeto para acceder a uno de sus metodos (nextLine) para leer lo que pusimos en la consola.
        System.out.println("El nombre es: " +nombre);

        //Para hacer menos lineas de código usamos tipo de variable var, porque sabemos lo que estamos usando.
        System.out.println("Ingresa tu apellido");
        var apellido = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("El apellido es: " +apellido);


    }

    public static void metodoConvercionDatos(){
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese una nombre");               //De cadena a cadena
        String nombre = consola.nextLine();

        System.out.println("Ingrese un numero");                //De cadena a int.
        int numero = Integer.parseInt(consola.nextLine());      //Llamamos a la clase Integer y a su metodo parseInt.    parseInt recibe la info que tiene consola.nextLine

        System.out.println("Hijo unico?");                      //De cadena a boolean
        boolean hijo =Boolean.parseBoolean(consola.nextLine()); //Llamamos a la clase Boolean y a su metodo parseBoolean.

        System.out.println("Precio Float: ");
        float precioFloat = Float.parseFloat(consola.nextLine());

        System.out.println("Precio Double: ");
        double precioDouble = Double.parseDouble(consola.nextLine());

        System.out.println("El nombre es: " +nombre+ " el numero es: " +numero+ " es hijo unico: " +hijo+ " y el precio Float: " +precioFloat+ " el precio Double es: " +precioDouble);
    }




}
