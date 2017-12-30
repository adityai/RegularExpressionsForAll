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
	
    public static void main( String[] args )
    {
        printEachWord(inputString);
    }
    
    public static void printEachWord(String input) {
    	String regexPatternString = "\\w+";
        Pattern pattern = Pattern.compile(regexPatternString);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.print("{\"StartIndex\": \"" + matcher.start() + "\", ");
            System.out.print("\"EndIndex\": \"" + matcher.end() + "\"\t");
            System.out.println("\"Word\" :" + matcher.group() + "\"}");
            System.out.println("------------------");
        }
    }
}
