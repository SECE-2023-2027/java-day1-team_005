import java.util.ArrayList;

public class div35 {
    public static void main(String[] args) {
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div5 = new ArrayList<>();
        ArrayList<Integer> both = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                div3.add(i);
            }  if ((i % 3 == 0)&& (i % 5 == 0)) {
                both.add(i);
            }  if (i % 5 == 0) {
                div5.add(i);
            }
        }
        System.out.println("Div of 3 :");
        for (int i : div3) {
            System.out.print(i + " ");
        }
        System.out.println("Div of 5 :");

        for (int i : div5) {
            System.out.print(i+" ");
        }
        System.out.println("Div of 3 and 5 :");
        for (int i : both) {
            System.out.print(i+" ");
        }
    }
}
