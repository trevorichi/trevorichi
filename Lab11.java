import java.util.Scanner;
public class Lab11 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to run part 1 or enter 2 to run part 2: ");
        int choice = s.nextInt();


        if(choice == 1) {
            double[] arrNum = new double[10];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < arrNum.length; i++) {
                arrNum[i] = s.nextDouble();
            }
            System.out.println("The mean is: " + mean(arrNum));
            System.out.println("The standard deviation is " + deviation(arrNum));
        }else if(choice == 2) {
            int[] list = new int[10];
            System.out.println("Enter 10 numbers:");
            for (int i = 0; i < list.length; i++) {
                list[i] = s.nextInt();
            }
            int[] newList = eliminateDuplicate(list);
            System.out.print("The distinct numbers are");
            for(int j = 0; j<newList.length; j++){
                System.out.print(" " + newList[j]);
            }

        }

    }
    // Mean method
    //**********************************************************
    public static double mean(double [] x){
        double sum = 0;

        for(int i = 0; i<x.length;i++){
            sum += x[i];
        }
        double mean = sum/x.length;

        return mean;

    }
    //**********************************************************

    // Standard Dev method
    //**********************************************************
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
    //**********************************************************

    public static int[] eliminateDuplicate(int[] list){
        int[] temp = new int[list.length];
        int tempIndex = 0;
        for (int i = 0; i < list.length; i++) {

            boolean isDuplicate = false;
            for (int k = 0; k < list.length; k++) {
                if (temp[k] == list[i]) {
                    isDuplicate = true;

                }
            }
            if (!isDuplicate) {
                temp[tempIndex++] = list[i];
            }

        }
        int[] newArr = new int[tempIndex];
        for (int i = 0; i < tempIndex; i++) {
            newArr[i] = temp[i];
        }

        return newArr;
    }




    }






