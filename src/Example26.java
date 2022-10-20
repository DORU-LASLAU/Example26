import java.util.Scanner;
public class Example26 {
    public static void main(String[] argv) {
        System.out.println("Enter the number:");
        int x;
        Scanner inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        for (int i=1; i<=x;i++) {
            if (x % i == 0 ) {
                System.out.println("  "+i);
            }
        }
    }
}
