package com.dave.lawton.main;

import java.util.Scanner;
import com.dave.lawton.utilities.BasicUtilities;

public class Main {
	
	public static BasicUtilities bu = new BasicUtilities();
	
	public static void main(String[] args)
	{
		boolean running = true;
		
		while(running)
		{
			String english = bu.getStringInput("Enter your English phrase");
			String pigLatin = convertPhrase(english);
			bu.printLN(english + " in Pig Latin is " + pigLatin + ".");
		}
	}
	
	private static String convertPhrase(String phrase)
	{
		String firstLetter = String.valueOf(phrase.charAt(0));
		phrase = phrase.substring(1, phrase.length()-1);
		phrase = phrase + "-" + firstLetter + "ay";
		return phrase;
	}

}
