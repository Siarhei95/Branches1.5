package Exercise1;
import java.util.Scanner;

public class Question_5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,x2, x;
        System.out.print("Enter x = ");
        x = scanner.nextDouble();
        if (x <= 3) {
            x1 =  Math.pow(x,2)- 3*x + 9;
            System.out.println("x = " + x1);
        } else if (x > 3) {
            x2 =  Math.rint((1/(Math.pow(x,3) + 6))*1000)/1000;
            System.out.println("x = " + x2);
        }
    }
}
