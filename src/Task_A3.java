public class Task_A3 {

    public static void main(String[] args) {

        String name = "My name is Cornel";
        String world1 = "ape";
        String world2 = "apeworld";
        String world3 = "ape";
        String world4 = "       ape";
        String [] parts = name.split(" ");
        System.out.println(name.indexOf("y"));
        System.out.println(name.startsWith("M"));
        System.out.println(name.compareTo("M"));
        System.out.println(world1.compareTo(world2));
        System.out.println(world1.compareTo(world3));
        System.out.println(world4);
        System.out.println(world4.trim());
        System.out.println(world1.replace("p","ff"));
        System.out.println(world1.replaceAll("ape","Affe"));
        System.out.println(parts[0]);





    }
}
