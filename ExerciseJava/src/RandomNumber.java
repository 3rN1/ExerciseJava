import java.util.Scanner;

public class RandomNumber {
    public void getRandomNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("-------- Numero Aleatorio --------");
        System.out.println("Digite el limite inferior: ");
        int lowerLimit = scanner.nextInt();
        System.out.println("Digite el limite superior: ");
        int upperLimit = scanner.nextInt();
        System.out.println("Cuantos numeros aleatoreos desea obtener: ");
        int qty = scanner.nextInt();

        for (int i = 0; i < qty; i++) {
            int randomNumber = (int)(lowerLimit + (upperLimit-lowerLimit+1)*Math.random());
            System.out.print(randomNumber+",");
        }
    }
}
