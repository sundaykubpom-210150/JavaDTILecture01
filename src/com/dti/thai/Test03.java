package com.dti.thai;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
//import java.io.*;

public class Test03 {
    //psvma
    public static void main(String[] args) throws IOException {
        //ประกาศตัวแปร
        String fullName;
        int age;
        double gpa;

        //สร้างตัวแทนของคลาส Input... กับ Bufer... เพื่อไปใช้รับค่า
        //(Instance of Class คือ Object คือ ชื่อที่ Dev ตั้งขึ้นมาเอง)
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        showSenPa();
        System.out.print("ป้อนชื่อ-สกุล : ");
        fullName = reader.readLine(); //ค่าที่ป้อนถือเป็น String ทั้งสิ้น
        System.out.print("ป้อนอายุ : ");
        age = Integer.parseInt( reader.readLine() );
        System.out.print("ป้อน GPA : ");
        gpa = Double.parseDouble( reader.readLine() );
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
