package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = sc.nextInt();
		
		float harmonic = 1;
	    for (int i = 2; i <= N; i++) {
	        harmonic += (float)1 / i;
	    }
	    
	    System.out.println("Harmonic number: "+ harmonic);
		

	}

}
