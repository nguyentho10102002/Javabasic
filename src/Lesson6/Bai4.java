package Lesson6;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int count = 0;
        int i = 2;
        while ( count < n) {
            if (isPrimeNumber(i)) {
                System.out.print( " " + i );
                count++;
            }
            i++;
        }
        System.out.println("\n Dãy số đầu tiên của dãy số fibonacci là : " );
        for (int j = 0;j < n; j++) {
            System.out.print( "   " + fibonacci(j));
        }
    }
        public static boolean isPrimeNumber(int n)
        {
            if (n < 2)
            {
                return false;
            }
            int squareRoot= (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }}

