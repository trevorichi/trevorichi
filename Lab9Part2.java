import java.util.Scanner;
public class Lab9Part2 {
    public static void main(String[]args){
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter the encrpyted message: ");
        String en = stdin.nextLine();

        String message = "";

        int i = 0;
        int j = 0;


        while (i < 5){
            message = message + en.charAt(j);
            j+=2;
            i++;

        }

        System.out.println(message);




    }

}
