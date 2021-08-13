package Lesson5;

import java.util.Scanner;

public class Mang3 {
    public static void main(String[] args){
        // Tìm vị trí trong mảng bằng 10 . Nếu ko có thì in ra "not found"
        Scanner scanner = new Scanner(System.in);
        int[] A = {3, 15, 2, 7, 9, 1, 6, 12, 19, 10};
        int x =10;
        int a = search(A, x);
        {
            if (a == 0) {
                System.out.println("Not found");
            } else {
                System.out.println("Tim thay tai vi tri: " + a);
            }
        }
    }
    public static int search(int[] A, int x) {
        for(int i = 1; i < 10; i++)
        {
            if (A[i] == x)
                return i;
        }
        return 0;
    }
}







