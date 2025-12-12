package a_TemasSencillos03;

// Sirve para dar valores iniciales a los atributos del objeto.
// Tiene el mismo nombre que la clase.
// Solo se manda a llamar al crear el Objeto.



// Un constructor permite asignar (inicializar) valores al momento de crear al Objeto. Por eso Constructor, construye el Objeto.
// Podemos mardarle parametros al crear el Objeto y los recibe el contructor para inicializar las variables. (si es que los necesitamos).
// o simplemente estar vacio y los inicializa con valores por defecto (null, 0).

// Si nosotros no agregamos un constructor, java lo hace automaticamente al crear un Objeto siempre y cuando no mandemos parametros. (vacio y no parametros).  Para valores por defecto.



// Sobrecarga de constructores.
//          Esto permite crear objetos de distintas formas.
//          Puedes tener varios constructores con el mismo nombre, pero con diferentes parámetros.


//          Cuando queremos hacer otro objeto y usar el constructor vacio (pero ya hay uno pero con parametros), ahora si java no nos lo da, porque ya hay uno.
//          Tenemos que hacer otro vacio.  Eso se conoce como sobrecarga de constructores. Es solo cuando ya existe uno y agregas más.


public class d_Constructores {

    int numero01;
    int numero02;

    // Constructor Vacio.
    // No recibimos parametros para inicializar nuestras variables (se inicializan por defecto null y 0).
    public d_Constructores(){       // public para poder hacer objetos de esta clase, desde otros archivos, pero de tipo de esta clase.
    }

    // Constructor con parametros.
    // Recibimos parametros para inicializar nuestras variables.
    public d_Constructores(int num01, int num02){   // public para poder hacer objetos de esta clase, desde otros archivos, pero de tipo de esta clase.
        this.numero01 = num01;
        this.numero02 = num02;  // this.  nos permite trabajar con los datos de esta clase y no con los parametros recibidos. (Para no confundir al IDE).
    }

    public void metodoMultiplicacion(){
        int resultado;
        resultado = numero01 * numero02;
        System.out.println("La multiplicacion es: " +resultado);
    }




    public static void main(String[] args) {
                                                            // Se llama al constructor y
        d_Constructores obj01 = new d_Constructores(10, 5); // Mandamos valores por parametros al Constructor para inicializar.
        obj01.metodoMultiplicacion();



        d_Constructores obj02 = new d_Constructores();      // Se llama al constructor vacio y
                                                            // se inicializan los datos por defecto (null y 0) con el constructor vacio que hicimos (ya que ya existia uno con parametros).
        obj02.numero01 = 100;                               // Así que se deben inicializar manualmente.
        obj02.numero02 = 50;
        obj02.metodoMultiplicacion();                       //      A esto se le llama sobrecarga de constructores.
    }



}
