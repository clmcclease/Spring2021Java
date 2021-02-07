/*	Christopher McClease 1001447271
 * 	INSY 4306-001
 * 	Assignment One
 */

import java.util.Scanner;

public class Assignment_One {
	
	public static void main(String[] args) {
		//Make a scanner to take input.
		Scanner chrisScanner = new Scanner(System.in);
		
		//make values for final output
		int wordCount = 0;
		int vowelCount = 0;
		int consonantCount = 0;
		int[] charCount = new int[26]; //all values initialize to 0 by default
		
		//request and take user input into a string
		System.out.println("Enter a sentance for us to work with: ");
		String mainString = new String(chrisScanner.nextLine());
		System.out.println();
		chrisScanner.close();
		
		//String array the main string for word count and further manipulation
		String[] splitString = mainString.split(" ");
		
		//update the word count
		wordCount = splitString.length;
		
		
		/*
		 * get rid of everything that isn't a letter like ! and ', etc
		 * make everything lowercase
		 * count vowels and consonants
		 * add letters to the charCount array as you process them
		*/ 
		for (String word : splitString) {
			char[] temp = word.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
			for(char ch : temp) {
				if((int)ch == 97 || (int)ch == 101 || (int)ch == 105 || (int)ch == 111 || (int)ch == 117) {
					vowelCount++;
				}
				else {
					consonantCount++;
				}
				charCount[((int)ch) -97]++;	
			}
		}
		
		//generate required outputs
		System.out.println("\n=========The Breakdown=========");
		System.out.format("%-25s%,5d%n", "Number of Words:", wordCount);
		System.out.format("%-25s%,5d%n", "Number of Vowels:", vowelCount);
		System.out.format("%-25s%,5d%n", "Number of Consonants:", consonantCount);
		System.out.println("\n=========Letter Counts=========");
		for(int i = 0; i < 13; i++) {
			System.out.format("%-6s ->%,4d || %-6s ->%,4d%n", (char)(i+65),charCount[i], (char)(i+78),charCount[i+13]);
		}
	}

}