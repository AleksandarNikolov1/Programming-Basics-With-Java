package L04_For_Loop.Lab;

import java.util.Scanner;

public class P04_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= n; i+=2) {
            System.out.println(Math.pow(2,i));
        }
    }
}
