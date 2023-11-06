import java.util.Scanner;

public class MultiplicationChart {
    public void getMultiplicationChart(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------- MULTIPLICATION CHART -----------");
        System.out.println("Digite el numero al que quiere generar la tabla: ");

        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            //El numero por la iteracion
            System.out.println(number+" * "+i+" = "+(number*i));
        }
    }
}
