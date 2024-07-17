package application.Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeneratePassword {
	
	private static final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	private static final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String numbers = "0123456789";
	private static final String specials = "!@#$%^&*()_+~`|}{[]:;?><,./-=";
		
	
	public String Generate(int length)
	{
		System.out.println("Generate password");
		
		Random random = new Random();
		
		int lowerCount = getRandomInt(random, 1, length - 3);
		int upperCount = getRandomInt(random, 1, length - lowerCount - 2);
		int digitCount = getRandomInt(random, 1, length - lowerCount - upperCount - 1);
		int symbolCount = getRandomInt(random, 1, length - lowerCount - upperCount - digitCount);
		
		String password = getRandomChars(random, lowerCase, lowerCount) +
						  getRandomChars(random, upperCase, upperCount) +
						  getRandomChars(random, numbers, digitCount) +
						  getRandomChars(random, specials, symbolCount);
		
		return shuffleString(password, random);
	}
	
	private static int getRandomInt(Random random, int min, int max)
	{
		return random.nextInt((max - min) + 1) + min;
	}
	
	private static String getRandomChars(Random random, String charset, int count)
	{
		Set<Character> usedChars = new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		while(result.length() < count)
		{
			char c = charset.charAt(random.nextInt(charset.length()));
			if(!usedChars.contains(c))
			{
				usedChars.add(c);
				result.append(c);
			}
		}
		
		return result.toString();
	}
	
	private static String shuffleString(String str, Random random)
	{
		ArrayList<Character> characters = new ArrayList<>();
		
		for (char c : str.toCharArray())
		{
			characters.add(c);
		}
		Collections.shuffle(characters, random);
		StringBuilder result = new StringBuilder(characters.size());
		for (char ch : characters)
		{
			result.append(ch);
		}
		
		return result.toString();	
	}
}
