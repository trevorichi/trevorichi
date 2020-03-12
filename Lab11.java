import java.util.Scanner;
public class Lab11 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double [] arrNum = new double[10];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<arrNum.length; i++ ) {
            arrNum[i] = s.nextDouble();
        }

        System.out.println("The mean is: " + mean(arrNum));
        System.out.println("The standard deviation is " + deviation(arrNum));


    }
    public static double mean(double [] x){
        double sum = 0;

        for(int i = 0; i<x.length;i++){
            sum += x[i];
        }
        double mean = sum/x.length;

        return mean;

    }

    public static double deviation(double x[])
    {
        double standardDeviation = 0.0;
        int length = x.length;

        double mean = mean(x);

        for(int i = 0; i < x.length; i++) {
            standardDeviation += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(standardDeviation/(length-1));
    }





}
