package SistemaDeVentas;

public class Prueba {
    public static void main(String[] args) {
        Producto gansito = new Producto("Gansito", 12.52);
        Producto chocorrol = new Producto("Chocorrol", 20.15);
        Producto chokis = new Producto("Chokis", 17.38);
        Producto nutella = new Producto("Nutella", 45.73);
        Producto pasitas = new Producto("Pasitas", 13.25);
        System.out.println("Productos en tienda");
        System.out.println(gansito);        // Gracias al metodo toString podemos imprimir al objeto. Y no a la referencia.
        System.out.println(chocorrol);      // Gracias al metodo toString podemos imprimir al objeto. Y no a la referencia.
        System.out.println(chokis);         // Gracias al metodo toString podemos imprimir al objeto. Y no a la referencia.
        System.out.println(nutella);        // Gracias al metodo toString podemos imprimir al objeto. Y no a la referencia.
        System.out.println(pasitas);        // Gracias al metodo toString podemos imprimir al objeto. Y no a la referencia.

        System.out.println();

        Orden objOrden1 = new Orden();
        objOrden1.agregarProducto(gansito);
        objOrden1.agregarProducto(chocorrol);
        objOrden1.mostrarOrden();

        System.out.println();

        Orden objOrden2 = new Orden();
        objOrden2.agregarProducto(pasitas);
        objOrden2.agregarProducto(chokis);
        objOrden2.agregarProducto(nutella);
        objOrden2.mostrarOrden();


    }
}
