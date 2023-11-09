import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void getMenu(){

        int option = 0;
        int result = 0;

        do{
            System.out.println("------- Operaciones matematicas -------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multi");
            System.out.println("4. Divi");
            System.out.println("5. Salir");

            System.out.println("Por favor dijite la opcion: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    result = addition();
                    break;
                case 2:
                    result = substraction();
                    break;
                case 3:
                    result = multiplication();
                    break;
                case 4:
                    result = division();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("Resultado = "+result);
        } while(option!=5);
        System.out.println("El programa ha finalizado");
    }
    private int addition(){
        int[] numbers = numbers("SUMA");
        return numbers[0]+numbers[1];
    }
    private int substraction() {
        int[] numbers = numbers("RESTA");
        return numbers[0]-numbers[1];
    }
    private int multiplication(){
        int[] numbers = numbers("MULTIPLICACION");
        return numbers[0]*numbers[1];
    }
    private int division(){
        int[] numbers = numbers("DIVISION");
        return numbers[0]/numbers[1];
    }
    private int[] numbers(String operation){
        System.out.println("Operacion "+operation);
        System.out.println("Digite el primer digito: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite el segundo digito: ");
        int num2 = scanner.nextInt();
        return new int[]{num1, num2};
    }
}
