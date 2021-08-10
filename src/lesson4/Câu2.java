package lesson4;
import java.util.Scanner;

public class Câu2
{
    public static void main(String[] args)
    {
        System.out.println("Enter value : ");
        int b, c;
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        c = sc.nextInt();
        if (b > c) {
            System.out.println("Số lớn hơn là : " + b);
        } else {
            System.out.println("Số lớn hơn là : " + c);
        }
    }
}
