package com.exercise;

public class Palindrome {

	 public static boolean isPalindrome(String checkWord) {
	       
		 if (checkWord == null || checkWord.equals("")) {
	            return false;
	        }
	        String reversed = reverseWord(checkWord);

	        return checkWord.equals(reversed);
	    }



	
	public static String reverseWord(String word) {
		
		if (word == null) {
            return null;
        }

        if (word.length() <= 1) {
            return word;
        }
        return reverseWord(word.substring(1)) + word.charAt(0);
	}

	
}
