package Lesson5;

import java.util.Scanner;

public class Mang4 {
    public static void main(String[] args) {
        // Cho mang A = new int[10] (option)
        // A[0]=4,A[1]=7,A[2]=8,A[3]=1,A[4]=5,A[5]=19,A[6]=11
        // In ra cái phần tử trong mảng A
        // Chèn A[2] = 100
        // Xóa A[1]
        System.out.println();
        int[] A = new int[10];
        Scanner sc = new Scanner(System.in);
        nhap(A);

    }
    public static void nhap(int[] A) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Nhập các phần tử cho mảng: ");
            for (int i = 0; i < 10; i++) {
                A[i] = sc.nextInt();
            }

            // Hiển thị mảng vừa nhập

            System.out.println("\nMảng là: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(A[i] + "      ");
            }
        }
            }
    }
