package SistemaDeVentas;

public class Orden {

    private static int contador = 0;
    private final int idOrden;

    private static final int MAX_PRODUCTOS = 10;
    private int contadorObjProductos;
    private Producto[] arrayProductos = new Producto[Orden.MAX_PRODUCTOS];

    public Orden() {
        this.idOrden = ++Orden.contador;
    }

    public void agregarProducto(Producto producto){
        if (this.contadorObjProductos < Orden.MAX_PRODUCTOS)
        this.arrayProductos[this.contadorObjProductos++] = producto;    // Post incremento, la siguiente vez que se use la variable, se le incrementa 1.
        else
            System.out.println("Maximo de productos alcanzado: " +Orden.MAX_PRODUCTOS);
    }

    public double calcularTotal(){
        double total = 0;
            for(int i = 0; i < this.contadorObjProductos; i++){
                total += this.arrayProductos[i].getPrecio();
            }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: " +idOrden);
        System.out.println("Total de la orden: " +this.calcularTotal());
        System.out.println("Productos ordenados: ");
        for (int i = 0; i < this.contadorObjProductos; i++){
            System.out.println(this.arrayProductos[i]);
        }

//      No se puede un ciclo for each porque recorre todo el arreglo, los vacios tambien.
//        for (Producto lol : this.arrayProductos){
//            System.out.println(lol);
//        }
    }

}
