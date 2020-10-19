public class Task_A3 {


    public static void main(String[] args) {
        task_03();
    }


    public static void tast_01() {
        String name = "My name is Cornel";
        String world1 = "ape";
        String world2 = "apeworld";
        String world3 = "ape";
        String world4 = "       ape";
        String[] parts = name.split(" ");
        System.out.println(name.indexOf("y"));
        System.out.println(name.startsWith("M"));
        System.out.println(name.compareTo("M"));
        System.out.println(world1.compareTo(world2));
        System.out.println(world1.compareTo(world3));
        System.out.println(world4);
        System.out.println(world4.trim());
        System.out.println(world1.replace("p", "ff"));
        System.out.println(world1.replaceAll("ape", "Affe"));
        System.out.println(parts[0]);


    }

    public static void task_02() {

        String name = "Java is Juicy";

        String[] array = name.split(" ");
        String name2 = "Java";
        String name3 = array[0];

        System.out.println(array[0]);
        if (name3 == name2) {
            System.out.println("ds");


        }



    }
    public static void task_03() {

        String correct_answer = "Coding is fun";
        String incorrect_asnwer = "Coding is fnu";
        System.out.println(correct_answer.endsWith("un"));
        System.out.println(incorrect_asnwer.endsWith("un"));
    }
}

