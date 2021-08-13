package lesson4;

import java.util.Scanner;

public class Câu5 {
    // Nhập vào 1 số nguyên từ bàn phím là tháng trong năm . Kiểm tra xem tháng đó có bao nhiêu ngày .
    public static void main(String[] args)
    {
        int month ;
        System.out.println("Enter Month : ");
        Scanner tha = new Scanner(System.in);
        month   = tha.nextInt();
        switch (month)
        {
            case  1 :
                System.out.println("31 ngày");break;
            case  2 :
                System.out.println("28 ngày");break;
            case  3 :
                System.out.println("31 ngày");break;
            case  4 :
                System.out.println("30 ngày");break;
            case  5  :
                System.out.println("31 ngày");break;
            case  6  :
                System.out.println("30 ngày");break;
            case  7 :
                System.out.println("31 ngày");break;
            case  8 :
                System.out.println("31 ngày");break;
            case  9 :
                System.out.println("30 ngày");break;
            case  10 :
                System.out.println("31 ngày");break;
            case  11 :
                System.out.println("30 ngày");break;
            case  12 :
                System.out.println("31 ngày");break;
            default:
                System.out.println("There is no this month of the year");break;
        }
    }
}
