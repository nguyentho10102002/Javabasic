package Lesson5;

import java.util.Scanner;

public class Mang2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] A = {3, 15, 2, 7, 9, 1, 6, 12, 19, 10};
        pr(A);
        int a = max(A);
        System.out.println("\nSố lớn nhất là : " + a);
        int b = min(A);
        System.out.println("\nSố nhỏ nhất là: " + b);
    }

    public static void pr(int[] A) {
        for (int i = 0; i < 10; i++) {
            A[i] = A[i] + 1;
            System.out.print("\nMảng là: " + A[i]);
        }
    }

    public static int max(int[] A)
    {
        int maxValue = A[0];
        for (int i = 1; i < 10; i++) {
            if (A[i] > maxValue) {
                maxValue = A[i];
            }
        }
        return maxValue;
    }
    public static int min(int[] A)
    {
        int minValue = A[0];
        for (int i = 1; i < 10; i++) {
            if (A[i] < minValue) {
                minValue = A[i];
            }
        }
        return minValue;
    }
}


