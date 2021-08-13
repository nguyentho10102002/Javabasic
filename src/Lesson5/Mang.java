package Lesson5;

import java.util.Scanner;

public class Mang
{
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < 10; i++)
        {
            array[i] = scanner.nextInt();
        }
        // Hiển thị mảng vừa nhập
        System.out.println("\nMảng là: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(array[i] + "      ");
        }
        // tính tổng số có trong mảng
        sum = array[0]+array[9];
        System.out.println("\nTổng số đầu và cuối có trong mảng = " + sum);
        // in ra những số chắn có trong mảng
        for (int i = 0; i < 10; i++)
        {
            if (array[i]%2==0) {
               System.out.println("Số chẵn của mảng là : " + array[i]);
            }
        }
    }
}
