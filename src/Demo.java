import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input: ");
        String input = sc.nextLine();

        System.out.println("hello " + input);

        sc.close();
    }
}
