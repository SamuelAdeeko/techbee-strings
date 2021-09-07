package com.exercise;

public class LastLetterCount {

	
	
	public static void lastLetterCount(String sentence) {
		
		int sentenceLength = sentence.length();
		  int count = 0;
		 sentence = sentence.toLowerCase();
		  for (int i = 0; i < sentenceLength; i++) {
		  
			  if (sentence.charAt(i) == 's' || sentence.charAt(i) == 'y') {
		    
		    	if (i < sentenceLength-1 && !Character.isLetter(sentence.charAt(i+1)))
		        count++;
		     
		    	else if (i == sentenceLength-1)
		        count++;
		    }
		  }
		  System.out.println(count);
	
		

	}
}
