import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        System.out.print("What is the input string? ");

        Scanner string = new Scanner(System.in);

        String input = string.nextLine();

        int length = input.length();

        System.out.printf("%s has %d characters.",input,length);

    }
}
