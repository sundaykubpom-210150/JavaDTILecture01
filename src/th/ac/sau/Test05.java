// รับคะแนนเลขจำนวนเต็มทางแป้นพิมพ์ แล้วแสดงผล 50 ขึ้นไปผ่าน ไม่ถึงไม่ผ่าน
package th.ac.sau;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        int score;
        String result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("ป้อนคะแนน : ");
        score = scanner.nextInt();
        System.out.println("----------------------------");

        result = score >= 50 ? "ผ่าน" : "ไม่ผ่าน";

        System.out.println("ผลคะแนนคือ : " + result);

    }
}
