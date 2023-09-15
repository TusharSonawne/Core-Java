package coreJava;

import java.util.Scanner;

public class MarksAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] sub = { "English" , "Hindi" , "Maths" , "Science" , "EVS" };
		int[] marks = new int[sub.length];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < sub.length; i++) {

			System.out.println("Enter marks for " + sub[i]);
			marks[i] = sc.nextInt();
			sum = sum + marks[i];
		}

		avg = sum / sub.length;
		System.out.println("You've scored " + avg + " percentage.");

		sc.close();
	}
	

}
