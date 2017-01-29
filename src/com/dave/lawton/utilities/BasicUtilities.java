package com.dave.lawton.utilities;

import java.util.Scanner;

public class BasicUtilities {
	
	public static void printLN(String message)
	{
		System.out.println(message);
	}
	
	public static void print(String message)
	{
		System.out.print(message);
	}
	
	public static String getStringInput(String prompt)
	{
		System.out.print(prompt + ": ");
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}

}
