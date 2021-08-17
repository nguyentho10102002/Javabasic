package Lesson5;
import java.util.Scanner;

public class Mang5 {
    public static void main(String[] args) {
        int size = 10 ; // độ lớn của mảng
        int[] A = new int[size];
        A[0] = 4;
        A[1] = 7;
        A[2] = 8;
        A[3] = 1;
        A[4] = 5;
        A[5] = 19;
        A[6] = 11;
        int n = 7;
        // in ra màn hình các phần tử của mảng
        System.out.print("\nTrước khi chèn : ");
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + "   ");
        // Chèn
        int x;
        int k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nSố cần chèn  =  ");
        x  = scanner.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nVị trí cần chèn k =  ");
        k = sc.nextInt();
        n = Insert(A, size, n, x, k);
        System.out.print("\nSau khi chèn : ");
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
    }
    public static int Insert(int[] A, int size, int n, int x, int k )
        {
      //  if (n >= size) {
        //    return n;
       // }
        if (k < 0 || k > n) // vị trí chèn phải nằm trong khoảng 0 đến n
        {
            return n;
        }
        for(int i = n; i > k; i--)
        {
            A[i] = A[i - 1];
        }
        A[k] = x;
        return n + 1;
    }
    }

