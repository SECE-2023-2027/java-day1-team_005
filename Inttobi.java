import java.util.Scanner;

public class Inttobi {

    public static int check(int n){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Inbuild function :"+Integer.toBinaryString(n));
        System.out.print("Without inbuild :"+ check());
    }
}
