package a_TemasSencillos04;

// Para existir polimorfismo, antes debe existir herencia y override.


// Polimorfismo permite que un mismo método(Override) se comporte de diferentes maneras, dependiendo del objeto que se use.

// El tipo siempre sera de la clase más generica, de la más arriba.

// En la varibale del tipo más generico, tambien podremos crear objetos de sus subclases, o sea, más especificos.
//              (Objeto)                                 (Almacenar)



// Animal obj1 = new Gato();
// El objeto ya actúa direfente.
// El Animal ya actúa como Gato.


// Muchas formas que puede tener un objeto.

// El objeto actúa de diferente forma.



public class c_Polimorfismo {
    public static void main(String[] args) {

        Animall obj1 = new Animall();
        obj1.hacerSonido();

        Animall obj2 = new Gato();
        obj2.hacerSonido();

        Animall obj3 = new Perroo();
        obj3.hacerSonido();

    }
}


class Animall{
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Gato extends Animall{
    @Override
    public void hacerSonido(){
        System.out.println("El gato hace miu miu");
    }
}

class Perroo extends Animall{
    @Override
    public void hacerSonido(){
        System.out.println("El perro hace wuaf wuaf");
    }
}