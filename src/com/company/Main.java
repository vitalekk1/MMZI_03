package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a, a0 = 1, a1 = 0, b, b0 = 0, b1 = 1, alpha, beta, r = 1, q, t, x, y, d;

        Scanner scanner = new Scanner(System.in);
	    System.out.println("Введите число a:");
	    a = scanner.nextInt();
        System.out.println("Введите число b:");
        b = scanner.nextInt();
	    scanner.close();
	    alpha = a;
	    beta = b;

	    while (r != 0){
	        q = (int)Math.floor(a/b);
	        r = a%b;

			System.out.println("r = " + r + " q = " + q);

	        a = b; b = r; t = a0; a0 = a1;
	        a1 = t-a1*q; t = b0; b0 = b1;
	        b1 = t- b1*q;
        }

	    x = a0;
	    y = b0;
	    d = alpha*x + beta*y;

	    System.out.println(" x = " + x + " y = " + y + " d = " + d);

    }
}
