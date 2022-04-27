import java.util.Random;
import java.util.Scanner;

public class MasterMind {
    public static void main(String[]args){
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f'};
        Random r = new Random();
        char[] arr = new char[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = letters[r.nextInt(letters.length)];
//            controle voor de random letters System.out.println(arr[i]);
        }
        Scanner invoer = new Scanner(System.in);
        System.out.println("voer 4 letters in (a,b,c,d,e,f)");
        String myString = invoer.nextLine();
        char[] charArray = myString.toCharArray();
        //  controle 4 letters  System.out.println(charArray);

        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]== 'q') {
                System.exit(0);
            }else if(charArray == arr){
                System.out.println("Je hebt gewonnen");
                System.exit(0);
            }else if (charArray[i] == arr[i]) {
                System.out.println(charArray[i] + " is correct");
            } else if (charArray[i] == arr[0] || charArray[i] == arr[1] || charArray[i] == arr[2] || charArray[i] == arr[3]) {
                System.out.println(charArray[i] + " staat op een andere plaats");
            } else {
                System.out.println(charArray[i] + " is fout");
            }
        }
    }

}


