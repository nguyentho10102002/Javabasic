package Lesson6;

import java.util.Scanner;

public class LietKe {
    public static void main (String[] args)
    {
        int n ;
        System.out.print("Nhập n = ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i++) {
            if (enterNumber(i))
            {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean enterNumber(int n)
        {
        if (n < 2) {
            System.out.print("Ko có số nguyên tố nào trong khoảng này. ");
        }
        // check so nguyen to khi n >= 2
        int sprt = (int) Math.sqrt(n);
        for (int i = 2; i <= sprt; i++) {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}


