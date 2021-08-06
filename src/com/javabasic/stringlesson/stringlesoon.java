package com.javabasic.stringlesson;

public class stringlesoon {
    public static void main(String[] args) {

        System.out.println("enter value : ");
        String a = "ToiYeuDaNang";
        // câu 1 : Vị trí kí tự a
        {
            System.out.println(" Vi tri ki tu a : " + a.indexOf("a") + " , " + a.lastIndexOf("a"));
        }
        // Câu 2 : Tách chuỗi
        {
            System.out.println("Tach chuoi a :" + a.substring(0,3) + " , "+ a.substring(3,6)+" , "+ a.substring(6,8)+" , "+
                     a.substring(8,12));
        }
        // Câu 3 : Nối từ
        {
            String first = "Toi";
            String a2 = first.concat("Yeu").concat("Da").concat("Nang");
            System.out.println("Chuoi duoc noi la :" + a2 );
        }
        // Câu 4 : Chỉ lấy chuỗi "DaNang" trong " ToiYeuDaNang"
        {
            System.out.println("Chuoi la : " + a.substring(6,12));
        }
        // Câu 5 : Đổi từ ToiYeuDaNang thành ToiYeuHaNoi
        {
            String a3 = a.replace ("DaNang" ,"HaNoi");
            System.out.println("Chuoi moi la :" + a3);
        }
        // Câu 6 : Kiểm tra chuỗi có rỗng hay không
        {
            System.out.println("Chuoi co rong hay ko rong la : " +  a.isEmpty());
        }
    }
}


