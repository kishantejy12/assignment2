package amstrong;

import java.util.Scanner;
public class amstrong {

 

    public static void main(String[] args) {

        int starting = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int N =sc.nextInt();
        sc.close();

        int ending= N;

        for (int i = starting; i <= ending; i++) {

            if (isArmstrong(i)) {

            	
                System.out.println(i );

            } else {

                 

            }

        }

    }

 

    public static boolean isArmstrong(int n) {

        int num = String.valueOf(n).length();

        int sum = 0;

        int value = n;

        for (int i = 1; i <= num; i++) {

            int digit = value % 10;

            value = value / 10;

            sum = sum + (int) Math.pow(digit, num);

        }

        if (sum == n) {

            return true;

        } else {

            return false;

        }

    }

}
