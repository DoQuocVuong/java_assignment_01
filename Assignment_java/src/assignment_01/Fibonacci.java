package assignment_01;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số của bạn:");
        int n = scanner.nextInt();
        System.out.println("Dãy số fibonacci " + n + " số là: ");

        for (int i = 0; i < n; i++) {
            sum += fibonacci(i);
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("Tổng: " + sum);
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
