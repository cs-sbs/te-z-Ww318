package package1;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum1 = 0, sum2 = 0,a;
        do {
            System.out.print("Enter an integer: ");
            a = in.nextInt();
            if(a !=-1) {
              if(a%2==0){
                  sum1 = sum1 + 1;
              }
              else{
                  sum2 = sum2 + 1;
              }
            }
            else{
                break;
            }
        }
        while (a != -1);
        System.out.println(sum2+"," + sum1);
    }
}
