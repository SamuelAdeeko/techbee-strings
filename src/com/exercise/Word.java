package com.exercise;


public class Word {

	public static void countWords(String sentence) {
		
		String[] words = sentence.split("");
		for(String w: words) {
			System.out.println(w);
		}
		int count = sentence.split("").length;
		System.out.println(count);

}
}