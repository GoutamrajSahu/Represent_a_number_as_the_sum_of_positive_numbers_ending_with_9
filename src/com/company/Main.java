//Given an integer N, the task is to chcek if N can be expressed as a su of
//integers having 9 as the last digit(9,19,29,39,...), or not. if found
//to be true then find the minimum count of such integers required to obtain
//N. Otherwise print -1.

//I/P: 156 , O/P: 4
//I/p: 60  , O/P: -1
//I/P:  18 , O/P: -1   [9+9=18, Here 9 repeated 2 times and repetition of same number not allowed.]


package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = Sc.nextInt();
        int lastDigit = num%10;
        int countOfIntegers = 10 - lastDigit;
        int check = num - (9*(9-lastDigit));
        int checkNum = (countOfIntegers)*9;
        if(check>=9 && check%10 == 9 && checkNum != num){
            System.out.println(countOfIntegers);
        }else{
            System.out.println("-1");
        }
    }
}