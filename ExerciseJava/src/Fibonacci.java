import java.util.Scanner;

public class Fibonacci {
    public void getFibonnaci(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("---------- Fibonacci Numbers -----------");
        System.out.println("Digite las posiciones deseadas de la serie de Fibonacci: ");

        int cantidadNumeros = scanner.nextInt();

        int tmp1 = 0;
        int tmp2 = 1;
        int tmp3 = 0;

        if (cantidadNumeros >= 1) {
            System.out.println(tmp1);
        }
        if (cantidadNumeros >= 2) {
            System.out.println(tmp2);
        }
        for (int i = 3; i <= cantidadNumeros; i++) {
            tmp3 = tmp1 + tmp2;
            System.out.println(tmp3);
            tmp1 = tmp2;
            tmp2 = tmp3;
        }
    }
}
