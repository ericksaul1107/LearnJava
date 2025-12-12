package a_TemasSencillos04;

// Es modificando uno método heredado (Se tiene que llamar igual).

// Una subclase puede modificar el comportamiento de un método heredado.
// Redefinir la funcionalidad de un método heredado.    Porque ya es más especifico.

// Cuando sobreescribimos un metodo, tenemos que usar la misma firma.




// super.metodo    para acceder al metodo de la clase padre. No importa si hiciste Override.

public class b_Sobreescritura {
    public static void main(String[] args) {

        Persona objPersona = new Persona();
        objPersona.horas();
        objPersona.edad();


        Jefe objJefe = new Jefe();
        objJefe.horas();        //Override.
        objJefe.edad();         //Override.

        Empleado objEmpleado = new Empleado();
        objEmpleado.horas();    //Override.
        objEmpleado.edad();     //Override.

        Repartidor objRepartidor = new Repartidor();
        objRepartidor.horas();  //Override.
        objRepartidor.edad();   //Sin Override. Solo Método heredado.

    }
}



class Persona{
    public void horas(){
        System.out.println("Persona: Trabajo por horas");
    }
    public void edad(){
        System.out.println("Persona: Tengo una edad");
    }
}



class Jefe extends Persona{
    @Override
    public void horas(){
        System.out.println("Jefe: Trabajo 4 horas");
    }
    @Override
    public void edad(){
        System.out.println("Jefe: Tengo 38 años");

        // super.metodo    para acceder al metodo de la clase padre. No importa si hiciste Override.
        System.out.println("Metodo edad de la clase Persona con super: ");
        super.edad();
    }

}


class Empleado extends Persona{
    @Override
    public void horas(){
        System.out.println("Empleado: Trabajo 8 horas");
    }
    @Override
    public void edad(){
        System.out.println("Empleado: Tengo 24 años");
    }
}


class Repartidor extends Persona{
    @Override
    public void horas(){
        System.out.println("Repartidor: Trabajo 12 horas");
    }
}

