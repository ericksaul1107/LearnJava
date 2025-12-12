package MaquinaSnacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {

    private static final List<Snack> InventarioSnacks;

    // Bloque Static Inicializador, es como un constructor para Statics, no hay objetos.
    // Se manda a llamar este bloque (constructor) en cuanto se cargue la clase (automaticamente).
    static {
        InventarioSnacks = new ArrayList<>();
        InventarioSnacks.add(new Snack("Chocorrol", 23));
        InventarioSnacks.add(new Snack("Gansito", 16));
    }

    // Metodo para agregar productos Snacks.
    public static void agregarSnacksInventario(Snack snack){
        InventarioSnacks.add(snack);
    }

    public static void eliminarSnackInventario(Snack snack){
        InventarioSnacks.remove(snack);
    }

    // Metodo para mostrar productos Snacks.
    public static void mostrarSnacksInventario(){
        String inventario = "";

        for (Snack lol : InventarioSnacks){
            inventario += lol.toString() + "\n"; // Le da formato legible.
        }

        System.out.println("Snacks en inventario:");
        System.out.println(inventario);

// Asi tambien se puede pero no con formato bonito y legible.

//        System.out.println("Snacks en inventario");
//        System.out.println(InventarioSnacks);
    }

    // La lista es privada entonces necesitamos un metodo get para leer la List.
    public static List<Snack> getListaSnacks(){
        return InventarioSnacks;
    }



}
