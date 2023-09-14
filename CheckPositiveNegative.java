package coreJava;

import java.util.Scanner;

public class CheckPositiveNegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println(num + " is positive");
		}

		else if (num < 0) {
			System.out.println(num + " is negative");
		}

		else
			System.out.println("You have entered a zero");

		sc.close();
	}
}
