public class Task_A4 {

    public static void main(String[] args) {
        String name = "Cornel Gurin";

        String [] array = name.split(" ");
        String [] array2 = array[0].split("");
        String [] array3 = array[1].split("");

        System.out.println(array2[0]+array3[0]);

    }
}
