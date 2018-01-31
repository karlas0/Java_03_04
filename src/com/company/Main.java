package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float suma = 0;
        float sk = 0;
        do {
            System.out.println("iveskite betkoki skaiciu");
            sk = sc.nextFloat();
            suma += sk;
        } while (sk != 0);
        System.out.println("suma yra: " + suma);


        // write your code here
    }
}
