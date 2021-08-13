package lesson4;
import java.util.Scanner;

public class Câu3 {
    public static void main(String[] args) {
        // Nhập 1 số nguyên tương ứng với tuổi của một người và kiểm tra.
        //Nếu <0: tuổi không hợp lệ
        //Nếu 0<=tuổi<18: thông báo ra màn hình là trẻ chou
        //Nếu 18<= tuổi: thông báo ra màn hình là người lớn
        //Nếu tuổi>200: thông báo ra màn hình là yêu tinh
        {
            System.out.println("Enter value : ");
            {
                int age ;
                System.out.println("Enter age : ");
                Scanner sb = new Scanner(System.in);
                age = sb.nextInt();
                if ( age < 0 )
                {
                    System.out.println("tuổi ko hợp lệ");
                }
                else
                if (0<=age && age <18)
                {
                    System.out.println("trẻ chou");
                }
                else
                if (age>18 &&  age<200){
                    System.out.println("người lớn");
                }

                else
                {
                    System.out.println("yêu tinh");
                }
            }
        }
    }
}
