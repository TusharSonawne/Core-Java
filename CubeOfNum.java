package coreJava;

import java.util.Scanner;

public class CubeOfNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number upto which you will get cubes of.");
		int n = sc.nextInt();
		int cube;

		for (int i = 1; i <= n; i++) {

			cube = i * i * i;
			System.out.println(i + "^3  =  " + cube);
		}

		sc.close();
	}

}
