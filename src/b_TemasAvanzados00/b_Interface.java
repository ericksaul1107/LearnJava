package b_TemasAvanzados00;

// Una interface se enfoca mas en comportamientos (metodos). De ley deben usarse, un contrato.
// Menos relacionado entre clase padre y hijas.

// Las Interfaces implementan sus clases hijas.
// implements

// Es lo mismo que Polimorfismo peroooo.
//  1. No se pueden hacer Objetos, nomas de sus clases hijas.
//  2. Sus metodos ya son public y abstractos, ya de ley. (Sin necesidad de poner public abstract).
//  3. Sus metodos como son (abstractos) de ley deben ser implementados en sus clases hijas.
//  4. No es Override, porque en si es la primera vez que se usa el metodo, es Implementacion.
//  5. No puede tener atributos, solo metodos default (normales). Eso ya es Override. Son Opcionales usarlos.
//  6. Una clase puede implementar varias interfaces (a diferencia de la herencia que es única).


// Una interfaz es un contrato, todos sus metodos deben ser implementados. (Menos los default que son opcionales usarlos).

// Los metodos de una interfaz siempre seran public y abstract.
// De igual manera, como son abstract, las clases que implementan de la interfaz deben implentar ese metodo.

// De igual manera que en una clase abstract, no es Override, porque es la primera vez que en si se usa el metodo.
// Es implementacion.


public interface b_Interface {
    public static void main(String[] args) {

        // No se puede instanciar una interface.
        // Traductor obj0 = new Traductor();

        Traductor obj1 = new Ingles();
        obj1.metodoDefaultNormalTraducir();
        obj1.traduciendo();
        Hablar obj2 = new Ingles();
        obj2.metodoDefaultNormalHablar();
        obj2.hablando();

        Traductor obj3 = new Frances();
        obj3.metodoDefaultNormalTraducir();
        obj3.traduciendo();
        Hablar obj4 = new Frances();
        obj4.metodoDefaultNormalHablar();
        obj4.hablando();

    }
}

interface Traductor{

    void traduciendo();

    default void metodoDefaultNormalTraducir(){
        System.out.println("Iniciando traductor");
    }
}

interface Hablar{

    void hablando();

    default void metodoDefaultNormalHablar(){
        System.out.println("Empezando a hablar");
    }
}

class Ingles implements Traductor, Hablar{
    @Override
    public void metodoDefaultNormalTraducir(){
        System.out.println("Iniciando traductor en ingles");
    }
    public void traduciendo(){
        System.out.println("Traduciendo a Ingles");
    }
    @Override
    public void metodoDefaultNormalHablar(){
        System.out.println("Empezando a hablar en Ingles");
    }
    public void hablando(){
        System.out.println("Hablando en Ingles");
    }
}

class Frances implements Traductor, Hablar{
    @Override
    public void metodoDefaultNormalTraducir(){
        System.out.println("Iniciando traductor en Frances");
    }
    public void traduciendo(){
        System.out.println("Traduciendo a Frances");
    }
    @Override
    public void metodoDefaultNormalHablar(){
        System.out.println("Empezando a hablar en Frances");
    }
    public void hablando(){
        System.out.println("Hablando en Frances");
    }
}