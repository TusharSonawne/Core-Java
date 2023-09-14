package coreJava;

import java.util.Scanner;

public class weekdays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weekday number (1-7)");
		int num = sc.nextInt();

		String[] weekday = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		if (num >= 1 && num <= 7) {

			for (int i = 0; i < weekday.length; i++) {

				if ((i + 1) == num)
					System.out.println(weekday[i]);
			}

		} else
			System.out.println("Please enter a number between 1 & 7");

		sc.close();
	}
}
