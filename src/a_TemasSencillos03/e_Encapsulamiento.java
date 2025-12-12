package a_TemasSencillos03;

// Encapsulamiento nos permite controlar el acceso a los atributos de la clase.
// Para evitar acceder a los atributos directamente usaremos el modificador de acceso private en cada una de las variables.
// Y para poder leer o modificar los atributos, usaremos get y set.

// Get (Obtener)        Permite leer el valor del atributo.         Retornar algun tipo (Del tipo que es el atributo).
// Set (Poner)          Perimte modificar el valor del atributo.    Void, no retorna nada.



// El estado del objeto, se refiere a como estan los modificadores de acceso en los atributos.

public class e_Encapsulamiento {

    private int numero01;
    private int numero02;

    public e_Encapsulamiento() {
    }

    public e_Encapsulamiento(int numero01, int numero02){
        this.numero01 = numero01;
        this.numero02 = numero02;
    }

    public void metodoSuma() {
        int resultado = numero01 + numero02;
        System.out.println("La suma es: " +resultado);
    }

    public void metodoResta() {
        int resultado = numero01 - numero02;
        System.out.println("La resta es: " +resultado);
    }

    // Metodo Get y Set.    (Atributo01).
    public int getNumero01(){
        return this.numero01;
    }

    public void setNumero01(int numero01){
        this.numero01 = numero01;
    }

    // Metodo Get y Set.    (Atributo02).
    public int getNumero02() {
        return this.numero02;
    }

    public void setNumero02(int numero02) {
        this.numero02 = numero02;
    }
}

// Clase de prueba.
// ya sin public las demas clases.

class PruebaEncapsulamiento{

    public static void main(String[] args) {
        System.out.println("- Objeto uno -");
        e_Encapsulamiento objeto01 = new e_Encapsulamiento(15, 5);
        objeto01.setNumero01(20);                                   // Modificamos con Set.     Mandamos nuevos valores.
        objeto01.setNumero02(30);                                   // Modificamos con Set.     Mandamos nuevos valores.
        System.out.println("Valor 01: " +objeto01.getNumero01());   // Leemos con Get.
        System.out.println("Valor 02: " +objeto01.getNumero02());   // Leemos con Get.
        objeto01.metodoSuma();

        System.out.println();

        System.out.println("- Objeto dos -");
        e_Encapsulamiento objeto02 = new e_Encapsulamiento(100, 50);
        objeto02.setNumero01(500);                                  // Modificamos con Set.     Mandamos nuevos valores.
        objeto02.setNumero02(50);                                   // Modificamos con Set.     Mandamos nuevos valores.
        System.out.println("Valor 01: " +objeto02.getNumero01());   // Leemos con Get.
        System.out.println("Valor 02: " +objeto02.getNumero02());   // Leemos con Get.
        objeto02.metodoSuma();

        System.out.println();

        System.out.println("- Objeto tres -");
        e_Encapsulamiento obj03 = new e_Encapsulamiento();      // En este usamos el constructor vacio.
        obj03.setNumero01(22);
        obj03.setNumero02(8);
        System.out.println("Valor 01: " +obj03.getNumero01());
        System.out.println("Valor 02: " +obj03.getNumero02());

    }

}
