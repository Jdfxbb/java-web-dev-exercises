package exercises;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Length: ");
        double length = input.nextDouble();
        System.out.println("Width: ");
        double width = input.nextDouble();
        double area = width * length;
        System.out.println("Rectangle " + length + "x" + width + " = " + area);
    }
}
