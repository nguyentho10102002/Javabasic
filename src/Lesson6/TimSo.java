package Lesson6;

import java.util.Scanner;

public class TimSo {
    public static int count(int[] array, int n, int i)
    {
        int count= 0;
        for(int j=0 ; j<n ; j++){
            if(array[j]== i)
                count ++;
        }
        return (count);
    }
    public static void main(String[] args) {
        int i;
        int n=10 ;
        Scanner scanner = new Scanner(System.in);
        int[] array= new int[n];
        for(i=0 ; i<n ; i++){
            System.out.println("Nhập phần tử thứ : " +(i+1)+" ");
            array[i]= scanner.nextInt();;
        }
        System.out.print("Các phần tử xuất hiện 1 lần : ");
        for(i=0 ; i<n ; i++){
            if(count(array, n, array[i])==1)
                System.out.print("  "+array[i]);
        }
    }
}
