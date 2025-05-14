import java.util.Scanner;

public class Attributesmain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = s.nextLine();

        System.out.println("Enter your age");
        int age = s.nextInt();

        System.out.println("Enter your city");
        String city = s.next();

        Attributes a = new Attributes(name,age,city);
        a.attributes();

    }
}
