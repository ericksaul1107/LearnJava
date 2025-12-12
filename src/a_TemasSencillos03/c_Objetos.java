package a_TemasSencillos03;

//  Un objeto es una “cosa” que tiene características (atributos) y acciones (métodos). Estas se declaran en una plantilla (clase).
//  Podemos crear varios objetos a partir de una plantilla (clase).

//  La plantilla (clase) nos perminte representar las caracteristicas en comun con los objetos.  Ya despues cada uno tiene sus propios valores.

//  Podemos decir que, una clase se compone de atributos y métodos.
//          Los atributos son las caracteristicas de los objetos.
//          Los métodos son las acciones que pueden realizar los objetos.

//  Instanciar una clase, se refiere al crear un objeto de esa clase. (una instancia de la clase).



//      Persona obj01 = new Persona();

//      Persona:    Tipo Persona, (qué atributos y métodos tendrán). Nombre de la clase a partir de la cual se va a crear el objeto.
//      obj01:      Almacena la referencia al objeto que se crea. Te permite acceder a los datos y métodos del objeto.
//      new:        Reserva un espacio en memoria para guardar ese objeto.
//      Persona():  Llama al constructor de clase Persona. Para inicializar el objeto, darle valores iniciales, que son parametros o no podemos pasar nada y se inicializan por defecto (null y 0).
//                  Si no ponemos el constructor, java lo pone automaticamente. se inicializa con valores por defecto, siempre y cuando no mandemos valores.

// Los Objetos se almacenan en la Ram entonces no duran para siempre. Es volatil.

public class c_Objetos {

    String nombre;
    String apellido;
    int edad;

    void metodoMostrar(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Apellido: " +apellido);
        System.out.println("Edad: " +edad);
    }


    public static void main(String[] args) {

        // Lo normal es que los objetos se creen desde otra clase.

        // Objeto01 de la clase.
        c_Objetos obj01 = new c_Objetos();  // Como no mandamos nada por parametros, se inicializan por defecto (null y 0).
        obj01.nombre = "Erick";             // JAVA nos hace un constructor para inicializar los valores, pero con null y 0.
        obj01.apellido = "Rosales";         //          Así que nosotros debemos inizializarlos. (No es comun).
        obj01.edad = 23;
        obj01.metodoMostrar();


        // Objeto02 de la misma clase.
        c_Objetos obj02 = new c_Objetos();
        obj02.nombre = "Saul";
        obj02.apellido = "De la Mora";
        obj02.edad = 35;
        obj02.metodoMostrar();
    }


}
