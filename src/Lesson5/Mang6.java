package Lesson5;

public class Mang6 {
    public static void main(String[] args) {
        int size = 20 ; // độ lớn của mảng
        int[] A = new int[size];
        A[0] = 4;
        A[1] = 7;
        A[2] = 8;
        A[3] = 1;
        A[4] = 5;
        A[5] = 19;
        A[6] = 11;
        int n = 10 ; // Số phần tử có trong mảng
        System.out.println("Trước khi delete: ");
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + "   ");
        int x = 7 ;
        n = Delete(A, n, x);
        System.out.println("\nSau khi delete : ");
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + "   ");
    }
    public static int Delete(int[] A, int n, int x)
    {
        // Xoa phan tu
        for (int i = 0  ; i < n; i++) {
            A[i] = A[i + 1];
        }
        return n - 1;
    }
}


