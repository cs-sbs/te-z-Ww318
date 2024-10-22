package package1;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int oddCount = 0;
        int evenCount = 0;
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        while(num!=-1) {
            if(num%2==0) {
                oddCount++;
            }
            else {
                evenCount++;
            }
            num=scanner.nextInt();
        }
        System.out.println(oddCount+" "+evenCount);
    }
}

