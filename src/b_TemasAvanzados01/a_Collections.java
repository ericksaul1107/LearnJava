package b_TemasAvanzados01;
import java.util.*;

// Java Collections son similares a los arreglos pero con la principal caracteristica que son dinamicos.

//                                                              (Implementa)
//      Interfaz              Collection                    Esta hereda a sus interfacez hijas, que si es de una interfaz a otra, es mas como herencia.
//      Interfaz    List                    Set             Esta implementa a las clases hijas.
//      Clase       ArryList                                Tienen la implementacion de su interfaz padre, pueden usar sus metodos (add, set, get).

//      Interfaz                 Map
//      clase                  HashMap

// No se pueden hacer objetos de interfacez, asi que se hacen de las clases.




// Se usa la implementacion (herencia) de la interfaz collection, a la interfaz list o map.
// y estas interfaceces List o Map implementan a sus clases hijas ArrayList, LinkedList

// Estan en el paquete java.util




public class a_Collections {
    public static void main(String[] args) {

    //List -------------------------------------------------------------------------------------------------------------
    // Respeta el orden y permite duplicados.

            List miLista1 = new ArrayList<>();
            miLista1.add("Lunes");
            miLista1.add("Martes");
            miLista1.add("Miercoles");
            miLista1.add("Jueves");
            miLista1.add("Viernes");
            miLista1.add("Sabado");
            miLista1.add("Domingo");
            miLista1.add("Domingo");

            System.out.println("Elementos de List con clase ArrayList");

            for (Object lol : miLista1){                        // forEach normal
                System.out.println("Dia de la semana: " +lol);
            }




            // Tipo Generico en una List.   Es para especificar un tipo de dato en una List. De lo contrario, solo son de tipo objeto.

            List <Integer> miLista2 = new ArrayList<>();
            miLista2.add(1);
            miLista2.add(2);
            miLista2.add(3);
            miLista2.add(4);
            miLista2.add(4);

            System.out.println("Elementos de List <Int> con clase ArrayList");

            miLista2.forEach(parametroVariable -> {      // forEach con funcion lambda (Programacion funcional).
                System.out.println(parametroVariable);          // De forma muy compacta. Funcion Anonima. Programacion Funcional.
            });                                                 // Programacion Funcional (no de objetos).
                                                                // miLista01.forEach es parte de la interfaz List




            // Clase Arrays con su metodo .asList para hacer Lista rapida.

            List <String> miLista3 = Arrays.asList("Erick", "Saul", "Rosales");

            System.out.println("Elementos de List <String> con clase Arrays.asList");
            miLista3.forEach(System.out::println);              // forEach con metodo de referencia ::println es un metodo estatico
                                                                // Metodo de referencia ::println
                                                                // println es un metodo estatico.

// Set -----------------------------------------------------------------------------------------------------------------
// No respeta el orden y no perimite duplicados.

// Se les conoce como estructura de datos.

        // La clase TreeSet nos respeta el orden aunque la interfaz sea Set (Set no respeta orden).
        Set <String> conjunto = new TreeSet<>();
        conjunto.add("Audi");
        conjunto.add("Toyota");
        conjunto.add("Nissan");
        conjunto.add("Mclaren");
        conjunto.add("Mclaren");

        System.out.println("Elementos del Set <String> con clase TreeSet");
        conjunto.forEach(System.out::println);

        conjunto.remove("Nissan");

        System.out.println("Nuevos elementos del Set <String> con clase TreeSet");
        conjunto.forEach(System.out::println);


// Map -----------------------------------------------------------------------------------------------------------------
// Llave - Valor

// Se les conoce como diccionario.
// Para leer unMap al ultimo se tiene que convertir a Set.

        Map <String, Integer> people = new HashMap<>();
        people.put("Erick", 23);
        people.put("Karla" ,22);
        people.put("Saul", 25);
        people.put("Saul", 25); // Como despues se convierte de Map a Set, no se duplican elementos.

        System.out.println("Elementos llave valor del Map <String, Integer> con clase HashMap");
        // Generamos o convertimos a tipo Set para poder leerlos con .entrySet
        people.entrySet().forEach(System.out::println);

        people.remove("Karla");

        System.out.println("Nuevos elementos llave valor del Map <String, Integer> con clase HashMap");
        // Generamos o convertimos a tipo Set para poder leerlos.
        people.entrySet().forEach(System.out::println);

        // Para acceder a la llave o al valor independientemente. Se necesita una funcion Lambda.
        System.out.println("Elementos individuales llave valor del Map <String, Integer> con clase HashMap");
        people.forEach((key, value) -> System.out.println("LLave: " +key+ " ,Valor: " +value)); // Otra forma de usar funcion Lambda.



    }
}