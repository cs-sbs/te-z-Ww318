package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        int result = 0;

        // 计算奇偶性特征对应的二进制值的各位之和
        while (inputNumber > 0) {
            int digit = inputNumber % 10;
            if (digit % 2 == 0) {
                result += 0;
            } else {
                result += 1;
            }
            inputNumber /= 10;
        }

        System.out.println(result);
    }
}
