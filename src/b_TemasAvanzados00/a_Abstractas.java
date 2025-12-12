package b_TemasAvanzados00;

// Una clase Abstract se enfoca mas en caracteristicas y comportamientos en comun. (atributos y metodos).
// Mas relacionado entre clases padre y clases hijas.

// Las clases Abstract, heredan a sus clases hijas.
// extens

// Es lo mismo que Polimorfismo peroooo.
//  1. No se pueden hacer Objetos, nomas de sus clases hijas.
//  2. Sus metodos abstractos de ley deben ser implementados en sus clases hijas.
//  3. No es Override, porque en si es la primera vez que se usa el metodo abstract, es Implementacion.
//  4. Si puede tener metodos normales, ademas atributos. Ahi en el caso de usar metodos normales si es Override. Es opcional.



// Una clase abstracta es una clase que sirve como modelo o plantilla para otras clases.
// No se puede crear (instanciar) directamente, pero sí se puede heredar de ella.

// Puede tener métodos normales (con cuerpo) y métodos abstractos (sin cuerpo).
// Los métodos abstractos obligan a las clases hijas a implementarlos.
// Al hacer esto no se conoce como Override, porque en si, es la primera vez que se usa el metodo. (No es Override tal como tal).
// Más bien se le conoce como implemetar al metodo.

// Estamos aplicando Polimorfismo, ya que no se pueden hacer objetos de la clase padre.

public abstract class a_Abstractas {
    public static void main(String[] args) {

        // No se puede instanciar una clase abstract.
        // figura obj0 = new figura();

        Figura obj1 = new rectanguo();
        obj1.metodoDibujar();
        obj1.metodoNormal();

        Figura obj2 = new circulo();
        obj2.metodoDibujar();
        obj2.metodoNormal();
    }
}


abstract class Figura{

    int lados;

    public abstract void metodoDibujar();  // Un metodo abstract, así aseguras que en tus clases hijas lo implementen si o si.

    public void metodoNormal(){
        System.out.println("Metodo Normal");
    }
}

class rectanguo extends Figura{
    public void metodoDibujar(){           // Metodo Abstract, Implementarlo de ley.
        System.out.println("Soy un rectangulo");
    }
    @Override                              // Metodo normal, Opcional.
    public void metodoNormal(){
        System.out.println("Override del metodo normal");
    }
}

class circulo extends Figura{
    public void metodoDibujar(){           // Metodo Abstract, Implementarlo de ley.
        System.out.println("Soy un circulo");
    }
    @Override                              // Metodo normal, Opcional.
    public void metodoNormal(){
        System.out.println("Override del metodo normal");
    }
}