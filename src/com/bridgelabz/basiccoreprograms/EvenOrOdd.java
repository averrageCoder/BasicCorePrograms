package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		if (number%2==0)
			System.out.println(number + " is an even number!");
		else
			System.out.println(number + " is an odd number!");
		

	}

}
