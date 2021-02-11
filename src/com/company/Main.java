package com.company;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        System.out.println("Vvedit m- ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Vvedit n- ");
        int n = sc.nextInt();
        System.out.println("Vvedit k- ");
        int k = sc.nextInt();
        System.out.println("Vklad  dorinyuye");
        sc.close();
        for (int i=0; i<k;i++){
            m += m + (m*n)/100;

          System.out.println(m);}

    }
}