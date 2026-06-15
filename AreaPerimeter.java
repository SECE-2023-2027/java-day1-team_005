import java.util.Scanner;

public class AreaPerimeter {
    static double pi = 3.14;
    public static double area(int r){
        return pi *r*r;
    }
    public static double perimeter(int r){
        return 2*pi*r;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Area of Circle :"+ area(r));
        System.out.println("perimeter of circle :"+perimeter(r));
    }
}
