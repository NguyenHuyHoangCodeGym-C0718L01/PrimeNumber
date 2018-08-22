package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        a = scanner.nextInt();

        if(a==0||a==1) {
            System.out.println("No Prime Number: "+a );
        }else{
            int count = 0;
            for(int i = 1; i <= a; i++){
                if(a%i==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("Prime Number: "+a);
            }else{
                System.out.println("No Prime Number: "+a);
            }
        }
    }
}
