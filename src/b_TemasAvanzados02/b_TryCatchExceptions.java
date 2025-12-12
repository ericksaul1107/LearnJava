package b_TemasAvanzados02;
public class b_TryCatchExceptions {

    // Try Catch procesa la poscible Exception, para no tronar el programa.
    // Se usan para reportar problemas.

    public static void main(String[] args) {

        int num1 = 10, num2 = 0;
        try {
            float resultado = num1 / num2;
            System.out.println("Resultado: " +resultado);
        }catch (Exception e){
            System.out.println("Ocurrio una exception: " +e);
        }


    }

}
