package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		
	  System.out.println("Enter a character :");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      ch = Character.toLowerCase(ch);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
         System.out.println("Given character is an vowel");
      }else{
         System.out.println("Given character is a consonant");
      }

	}

}
