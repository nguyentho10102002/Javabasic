package lesson4;

import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args)
    // Nhập vào 1 số N . Tính tổng 1 + 2 + ... + N .
    {
        int N ;
        System.out.println("Enter  N : ");
        Scanner Sn = new Scanner(System.in);
        N   = Sn.nextInt();
        int sum = 0 ;
        for(int i = 1; i <= N; i++)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);

    }
}
