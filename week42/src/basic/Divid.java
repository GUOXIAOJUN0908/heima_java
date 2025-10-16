package basic;

import java.util.Scanner;

public class Divid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number as dividend");
        int dividend=sc.nextInt();
        System.out.println("enter a number as divisor");
        int divisor=sc.nextInt();
        int Quotient,Remainder;
        int counter=0;
        sc.close();
        if(dividend==divisor){
            Quotient = 1;
            Remainder = 0;
            System.out.println(Quotient);
            System.out.println(Remainder);
        } else if (dividend<divisor) {
            Quotient = 0;
            Remainder = dividend;
            System.out.println(Quotient);
            System.out.println(Remainder);
        } else{
            while(dividend>=divisor){
                dividend = dividend-divisor;
                counter++;
            }
            Quotient= counter;
            Remainder = dividend;
            System.out.println(Quotient);
            System.out.println(Remainder);
        }


    }
}
