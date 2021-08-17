package Lesson6;
import java.util.Scanner;

public class Bai6
{
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(" n = ");
        phanTich(n);
    }
        public static void phanTich(int n)
        {
            for (int i = 2; i <= n; i++)
            {
                while (n % i == 0)
                {
                    System.out.printf("%d", i);
                    if (n != i){
                        System.out.print("*");
                    }
                    n /= i ;

                }

            }
        }
}


