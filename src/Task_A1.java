public class Task_A1 {




    public static void main(String[] args) {
        String hannah = "Did Hannah see bees?,Hannah did";
        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        method();

    }

    public static void method(){
        String OriginalString = "Java is great";
        int a = 3;
        int b = 1;
        char [] k = OriginalString.toCharArray();


        System.out.println("The character position " + b + " is " + k[b]);
        System.out.println("The character position " + a + " is " + k[a]);


    }
}
