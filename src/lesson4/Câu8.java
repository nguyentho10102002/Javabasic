package lesson4;

import java.util.Scanner;

public class Câu8 {
    public static void main(String[] args)

       // Nhập vào 1 số M . Cho biết đó có phải só nguyên tố hay ko
          {
         System.out.println("input M : ");
         Scanner soM = new Scanner(System.in);
         int M ;
         M = soM.nextInt();
         if(CheckSnt(M)==true)
         {
             System.out.println("The number M is a prime number");

         }
         else
         {
            System.out.println("The number M is not prime");
         }
          }
public static boolean CheckSnt(int M)
    {
        if (M < 2)
    {
        return false;
    }
     else
        {
            for (int i = 2 ; i < Math.sqrt(M) ; i++ )
          // for (int i= 2 ; t < M-1 ; i++ )
            {
                if (M%i==0){
                    return false;
                }
            }
        }
     return true ;
    }
         }

