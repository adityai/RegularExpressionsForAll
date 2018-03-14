package com.regex.java.examples;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private static App app = new App();
	private static final String WORD_PATTERN = "\\w+";
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    
    public void testPrintEachWord(){
    	String input = "Happy, Joyful, Pleasant, Overjoyed, Fantastic, Great, Monkey, Energize, Excited";
    	String actual = app.printEachWord(input);
    	String expected = "Happy\nJoyful\nPleasant\nOverjoyed\nFantastic\nGreat\nMonkey\nEnergize\nExcited\n";
    	assertEquals(expected, actual);
    }
}
