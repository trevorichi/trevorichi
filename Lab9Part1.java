import java.util.Scanner;
public class Lab9Part1 {
    public static void main(String[]args){
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter the phone number: ");
        String number = stdin.nextLine();
        if(number.length() != 10){
            System.out.println("Enter a proper phone number!!!");
        }else{
            String str = "(";
            String str1 = number.substring(0,3) + ")";
            String str2 = number.substring(3,6);
            String str3 = "-" + number.substring(6,10);

            System.out.println(str+str1+str2+str3);

        }



    }
}
