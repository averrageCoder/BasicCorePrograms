package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int temp_variable;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first_number = sc.nextInt();
		System.out.println("Enter the second number: ");
		int second_number = sc.nextInt();
		
		temp_variable = first_number;
		first_number = second_number;
		second_number = temp_variable;
		
		System.out.println("First number: "+first_number);
		System.out.println("Second number: "+second_number);
		
	}

}
