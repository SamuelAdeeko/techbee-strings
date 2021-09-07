package com.exercise;

public class TestSolution {

	public static void main(String[] args) {
		
		Vowel vowel = new Vowel();
		vowel.page("Hello, my name is james. I am a Software Development Engineer in Test. ");

		
		System.out.println(Palindrome.isPalindrome("mallam"));
		Word.countWords("This is my house");
		
		Consonants.page("Hello, my name is james. I am a Software Development Engineer in Test. ");
		Consonants.replaceConsonants("Hello, my name is james. I am a Software Development Engineer in Test. ");
	
	
		LastLetterCount.lastLetterCount("Hellos, my name is james. I am as Software Development Engineer in Test. ");
	}

}
