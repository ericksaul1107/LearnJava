package MaquinaSnacks;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {

    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        Scanner consola = new Scanner(System.in);

        int opcion;
        boolean salir = false;
        List<Snack> listaCompras = new ArrayList<>();   // Creamos lista de compras.

        while (!salir){
            try {
                Snacks.mostrarSnacksInventario();
                opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(consola, opcion, listaCompras);
            } catch (Exception e){
                System.out.println("Ocurrio un error: " +e);
            } finally {
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                Menu
                1. Comprar Snack.
                2. Mostrar ticket.
                ----
                3. Agregar Nuevo Snack Inventario.
                4. Eliminar Snack de inventario.
                5. Salir
                Elija una opcion: """);
        return Integer.parseInt(consola.nextLine());    //Leemos, convertimos y retornarmos al mismo tiempo.
        //return consola.nextInt();
    }

    private static boolean ejecutarOpciones(Scanner consola, Integer opcion, List<Snack> listaCompras){     // Aqui se van a ir agregando los productos a la List.
        boolean salir = false;
        switch (opcion){
            case 1 -> comprarSnack(consola, listaCompras);
            case 2 -> mostrarTicket(listaCompras);
            case 3 -> agregarSanck(consola);
            case 4 -> eliminarsSnack(consola);
            case 5 -> salir = true;
            default -> System.out.println("Opcion Invalida: " +opcion);
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> listaCompras){
        System.out.println("id del snack desea comprar: ");
        int idSnack = Integer.parseInt(consola.nextLine());

        // Validar id.
        boolean snackEncontrado = false;
        for (Snack xd : Snacks.getListaSnacks()){       // Retorna literalmente la lista, no como el otro metodo de solo mostrar los datos.
            if (idSnack == xd.getIdSnack()){
                listaCompras.add(xd);
                System.out.println("Snack: " +xd+ " comprado");
                snackEncontrado = true;
                break; // rompe el for.
            }
        }
        if (!snackEncontrado){
            System.out.println("id Snack no encontrado");
        }
    }

    private static void mostrarTicket(List<Snack> listaCompras){
        String tikect = "";
        double total = 0.0;
        for (Snack ff : listaCompras){
            tikect += ff.getNombre() + " " +ff.getPrecio();
            total += ff.getPrecio();
        }
        tikect += total;
        System.out.println(tikect);
    }




    // Agregar y eliminar del inventario.
    private static void agregarSanck(Scanner conosla){
        String nombre;
        double precio;

        System.out.println("Ingrese nombre de nuevo Snack");
        nombre = conosla.nextLine();
        System.out.println("Ingrese precio de nuuevo Snack");
        precio = Double.parseDouble(conosla.nextLine());

        Snack objNuevo = new Snack(nombre, precio);

        Snacks.agregarSnacksInventario(objNuevo);
        System.out.println("Agregado Nuevo Snack en Inventario ");
        Snacks.mostrarSnacksInventario();
    }

    private static void eliminarsSnack(Scanner consola){

        System.out.println("id del snack desea eliminar: ");
        int idSnack = Integer.parseInt(consola.nextLine());

        // Validar id.
        //boolean snackEncontrado = false;
        for (Snack xd : Snacks.getListaSnacks()){       // Retorna literalmente la lista, no como el otro metodo de solo mostrar los datos.
            if (idSnack == xd.getIdSnack()){
                Snacks.eliminarSnackInventario(xd);
                System.out.println("Snack: " +xd+ " eliminado");

                //snackEncontrado = true;
                //break; // rompe el for.
            } else{
                System.out.println("id Snack no fue encontrado");
            }
        }
//        if (!snackEncontrado){
//            System.out.println("id Snack no encontrado");
//        }


        System.out.println("Eliminado Snack en Inventario");
        Snacks.mostrarSnacksInventario();
    }

}
