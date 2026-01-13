package th.ac.sau;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //ประกาศตัวแปร
        String fullName;
        int age;
        double gpa;

        //สร้างตัวแทนของ Scanner เพื่อใช้ในการรับค่า
        Scanner wow = new Scanner(System.in);

        showSenPa();
        System.out.print("ป้อนชื่อ-สกุล : ");
        fullName = wow.next(); //รับข้อความ
        System.out.print("ป้อนอายุ : ");
        age = wow.nextInt(); //รับเลขจำนวนเต็ม Int
        System.out.print("ป้อน GPA : ");
        gpa = wow.nextDouble(); //รับเลขทศนิยมแบบระเอียด
        showSenPa();
        System.out.println("สวัสดี " + fullName);
        System.out.println("คุณอายุ " + age + " ปี");
        System.out.println("GPA : " + gpa);
        showSenPa();
    }

    public static void showSenPa(){
        System.out.println("------------------------------------------");
    }
}
