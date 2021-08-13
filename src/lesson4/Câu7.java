package lesson4;

import java.util.Scanner;

public class Câu7 {
    public static void main(String[] args)
    {
        // Nhập vào 1 số viết chương trình tính bảng nhân của số đó.

            System.out.println(" input a : "  );
            Scanner so = new Scanner(System.in);
            int e ;
            int y ;
            e = so.nextInt();
            for(int i = 1; i <= 10; ++i)
            {
                y = e * i ;
                System.out.println(e + " * " + i   + " = " +y);
                // System.out.printf("%d * %d = %d \n", a , i ,a  * i);
            }

    }
}
