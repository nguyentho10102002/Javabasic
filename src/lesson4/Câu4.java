package lesson4;

import java.util.Scanner;
public class Câu4 {
    public static void main(String[] args)
    //  Nhập vào 1 số nguyên và in ra thứ trong tuần viết bằng chữ tương ứng với số đó
    {
        int thu ;
        System.out.println(" Enter number: ");
        Scanner th = new Scanner(System.in);
        thu  = th.nextInt();
        switch (thu)
        {
            case  0 :
                System.out.println("Sunday");break;
            case  2 :
                System.out.println("Monday");break;
            case  3 :
                System.out.println("Tuesday");break;
            case  4 :
                System.out.println("Wednesday");break;
            case  5  :
                System.out.println("Thursday");break;
            case  6  :
                System.out.println("Friday");break;
            case  7 :
                System.out.println("Saturday");break;
            default:
                System.out.println("The number is invalid");break;
        }
    }
}

