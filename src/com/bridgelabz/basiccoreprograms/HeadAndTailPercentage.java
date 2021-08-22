package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HeadAndTailPercentage {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of tosses: ");
		int num_tosses= sc.nextInt();
		int heads_count = 0;
		
		for(int i=0; i<num_tosses; i++) {
			
			if(Math.random() > 0.5)
				heads_count++;
			
		}
		
		System.out.println("Head count: "+ heads_count);
		
		double heads_percentage = (double)heads_count/num_tosses * 100;
		
		System.out.println("Heads Percentage : " + heads_percentage);
		System.out.println("Tails Percentage : " + (100-heads_percentage));

	}
	
}
