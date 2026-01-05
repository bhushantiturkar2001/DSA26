package patternprinting;

public class Pattern1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {        // rows
            for (int j = 0; j < 5; j++) {    // columns
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
    }
}
