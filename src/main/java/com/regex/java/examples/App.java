package com.regex.java.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Regular Expression sample for parsing a comma separated string.
 *
 */
public class App 
{
	private static String inputString = "Happy, Joyful, Pleasant, Overjoyed, Fantastic, Great, Monkey, Energize, Excited";
	private static String inputStringWithDigits = "The age of the universe is about 13.6 billion years";
	
    public static void main( String[] args )
    {
        System.out.println(printEachWord(inputString));
        System.out.println(printEachNumber(inputStringWithDigits));
    }
    
    public static String printEachWord(String input) {
    	String regexPatternString = "\\w+";
        Pattern pattern = Pattern.compile(regexPatternString);
        Matcher matcher = pattern.matcher(input);
        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()) {
            stringBuilder.append(matcher.group()).append("\n");
        }
        return stringBuilder.toString();
    }
    
    public static String printEachNumber(String input) {
    	String regexPatternString = "\\d+";
        Pattern pattern = Pattern.compile(regexPatternString);
        Matcher matcher = pattern.matcher(input);
        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()) {
            stringBuilder.append(matcher.group()).append(" ");
        }
    	return stringBuilder.toString();
    }
}
