import java.util.Scanner;

public class Lt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase latter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase latter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}
