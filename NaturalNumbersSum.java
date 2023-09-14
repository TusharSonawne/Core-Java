package coreJava;

import java.util.Scanner;

public class NaturalNumbersSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;

		while (i <= num) {
			System.out.println(i);
			sum = sum + i;
			i++;
		}
		System.out.println("\nSum of all Natural Numbers upto " + num + " is " + sum);

		sc.close();
	}
}
