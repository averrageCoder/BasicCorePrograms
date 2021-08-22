package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = sc.nextInt();
		
		if(N <31 && N>=0) {
			
			for(int i=0; i<= N; i++) {
				
				System.out.println("2^"+i+" = "+Math.pow(2, i));
				
			}
			
		}
		else {
			System.out.println("Please enter a value less than 31 and greater than 0!");
		}
		
	}

}
