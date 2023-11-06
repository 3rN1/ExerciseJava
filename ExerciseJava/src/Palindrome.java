import java.util.Scanner;

public class Palindrome {
    public void getPalindrome(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("--------- Validate Palindrome ---------");
        System.out.println("Digite la cadena a evaluar: ");

        String cadena = scanner.nextLine();

        System.out.println(isPalindrome(cadena));
    }
    public boolean isPalindrome(String cadena){
        boolean sw = true;

        //remove spaces
        cadena = cadena.replace(" ", "");

        //compare char's
        for (int i = 0; i < cadena.length()/2; i++) {
            if (cadena.charAt(i)!=cadena.charAt(cadena.length()-1-i)){
                sw = false;
                break; //for
            }
        }

        return sw;
    }
}
