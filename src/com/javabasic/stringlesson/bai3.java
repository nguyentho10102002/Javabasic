package com.javabasic.stringlesson;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
//Nhập vào 1 số. Viết chương trình tính bảng nhân của số đó.
        System.out.println("enter value : ");
        System.out.println(" input a : "  );
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        int y ;
        for(int i = 1; i <= 10; ++i)
        {
            y = e * i ;
            System.out.println(e + " * " + i   + " = " +y);
    //        System.out.printf("%d * %d = %d \n", a , i ,a  * i);
        }


            }
        }

