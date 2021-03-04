package com.codersbay;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int [] numbers= new int[0];

        while (!scan.hasNext("q")){
            int number= scan.nextInt();
            System.out.println("Your number"+ number);

            int[] newArray=new int[numbers.length+1];
            for (int i=0; i<numbers.length;i++){
                newArray[i]=numbers[i];
            }

            newArray[numbers.length]=number;
            numbers=newArray;
            System.out.println(Arrays.toString(newArray));
        }
        int largest=numbers[0];

        for (int i=0; i< numbers.length; i++){
            if (numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("The largest number is:"+largest);
    }
}
