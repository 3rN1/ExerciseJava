import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class EvenOddMultip {
    public void getEvenOddMultip(){
        System.out.println("----- Deteccion de numeros pares, impares y multiplos -----");
        System.out.println("Digite el numero divisor deseado");

        Scanner scanner=new Scanner(System.in);
        int divisor = scanner.nextInt();

        List<Integer> listEven = new LinkedList<Integer>();
        List<Integer> listOdds = new LinkedList<Integer>();
        List<Integer> listMultip = new LinkedList<Integer>();

        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
                listEven.add(i);
            }else {
                listOdds.add(i);
            }
            if (i%divisor==0){
                listMultip.add(i);
            }
        }

        System.out.println("Even numbers");
        for (int value:listEven) {
            System.out.print(value+",");
        }
        System.out.println(" ");
        System.out.println("Odd numbers");
        for (int value:listOdds) {
            System.out.print(value+",");
        }
        System.out.println(" ");
        System.out.println("Multiplicity numbers of "+divisor);
        for (int value:listMultip) {
            System.out.print(value+",");
        }
    }
}
