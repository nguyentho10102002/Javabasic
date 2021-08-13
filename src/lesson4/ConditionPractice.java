package lesson4;
import java.util.Scanner;

public class ConditionPractice
{
        // Nhập vào 1 số. Kiểm tra và thông báo ra màn hình đó là số chẵn hay lẻ
    public static void main(String[] args)
    {
        System.out.println("enter value : ");
        int a ;
        System.out.println(" nhập a : "  );
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if ( a % 2 == 0)
        {
            System.out.println("Đây là số chẵn" );
        }
        else
        {
            System.out.println("Đây là số lẻ" );
        }
    }
}



