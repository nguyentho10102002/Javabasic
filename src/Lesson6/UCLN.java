package Lesson6;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập  a = ");
            int a = scanner.nextInt();
            System.out.print("Nhập  b = ");
            int b = scanner.nextInt();
            // tính USCLN của a và b
            int c = USCLN(a,b);
            System.out.println("USCLN của " + a + " và " + b
                    + " là: " + c );
    }
        public static int USCLN(int a, int b)
        {
            if (b == 0)
            return a  ;
            return USCLN(b,a % b);
        }
}

