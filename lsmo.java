import java.util.Scanner;

public class lsmo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int number = 0, letter = 0, other = 0, space = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                space++;
            } else if (Character.isDigit(ch)) {
                number++;
            } else if (Character.isLetter(ch)) {
                letter++;
            } else {
                other++;
            }
        }
        System.out.println("Letter :" + letter);
        System.out.println("space :" + space);
        System.out.println("number :" + number);
        System.out.println("other :" + other);
    }
}
