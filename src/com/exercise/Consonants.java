package com.exercise;

public class Consonants {

	
	public static void page(String sentence) {
		
		int count = 0;
		for(int i =0; i < sentence.length(); i++) {
			
			char ch = sentence.charAt(i);
			if(ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
				count++;
			}
		}
		System.out.println("Total number of consonants is " + count);
	}

	public static void replaceConsonants(String sentence) {
	

		String vowelRegex = "([^aeiouAEIOU0-9\\W]+)";
	    String replacedConsonants = sentence.replaceAll(vowelRegex, "*");
	    System.out.println("Replaced Consonants: "+ replacedConsonants);
		
		
	}
	
}
