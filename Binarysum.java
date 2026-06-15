import java.util.Scanner;

public class Binarysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bi1 = sc.next();
        String bi2 = sc.next();

        int num1 = Integer.parseInt(bi1, 2);
        int num2 = Integer.parseInt(bi2, 2);

        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        System.out.println("Sum: " + result);
    }
}