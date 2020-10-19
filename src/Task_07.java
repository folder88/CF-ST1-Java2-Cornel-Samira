


import java.util.Scanner;


public class Task_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        double x =input.nextDouble();
        System.out.println("Enter your second number");
        double y =input.nextDouble();
        System.out.println("Enter your third number");
        double z =input.nextDouble();




        System.out.println(method(x,y,z));


    }

    public static double method(double a,double b,double c){

        double final_number = (a+b+c)/3;

     return final_number;
    }
}
