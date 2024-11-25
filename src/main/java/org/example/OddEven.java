package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int countOdd = 0;
        int countEven = 0;
        Scanner in = new Scanner(System.in);
        // 使用while循环
        while (true) {
            try {
                System.out.print("请输入一个整数（输入 - 1结束）：");
                int number = in.nextInt();
                if (number == -1) {
                    break;
                }
                if (number % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            } catch (InputMismatchException e) {
                System.out.println("输入有误，请输入整数！");
                in.nextLine();
            }
        }
        System.out.println("奇数个数：" + countOdd);
        System.out.println("偶数个数：" + countEven);
    }
}