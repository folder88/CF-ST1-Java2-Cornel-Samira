public class Task_A5 {

    public static void main(String[] args) {

        method_1(40);
        method_1(50);
        method_1(60);
        method_2(40);
        method_2(50);
        method_2(60);


    }

    public static void method_1(int x){


        int result = (x-32)*5/9;

        System.out.println(result);
    }
    public static void method_2(int x){


        int result = (x*9/5) + 32;

        System.out.println(result);
    }
}
