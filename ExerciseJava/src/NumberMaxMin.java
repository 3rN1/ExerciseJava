
import java.util.Scanner;

public class NumberMaxMin {
    public void getNumberMaxMin(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- Number Max & Min ----------");
        System.out.println("Digite la cantidad de numeros ha evaluar");

        int cantidadNumeros = scanner.nextInt();
        int numeroMenor = 0;
        int numeroMayor = 0;

        for(int i = 0; i < cantidadNumeros; i++){
            System.out.println("Digite el numero en la posicion "+ (i+1));

            int tmp = scanner.nextInt();
            if (i == 0) {
                numeroMenor = tmp;
                numeroMayor = tmp;
            } else if (tmp < numeroMenor) {
                numeroMenor = tmp;
            }
            if (tmp > numeroMayor){
                numeroMayor = tmp;
            }
        }
        System.out.println("El numero MENOR es "+numeroMenor);
        System.out.println("El numero MAYOR es "+numeroMayor);
    }

}
