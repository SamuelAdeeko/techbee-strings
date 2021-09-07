package com.exercise;


public class Vowel {

	
	/*
	1. Create Vowels class in JAVA then do the following:
		- Ask User to enter a sentence or create a String variable to assign a sentence to it
		- Count all the vowels in a sentence and display the count

	*/
	
	String[] vowels = {"a", "e", "i", "o", "u"};
	
	
	public void page(String sentence) {
		
		int count = 0;
		for(int i =0; i < sentence.length(); i++) {
			
			char ch = sentence.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Total number of vowels is " + count);
	}
}
