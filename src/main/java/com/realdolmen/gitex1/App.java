package com.realdolmen.gitex1;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int firstNumber;
	private static int secondNumber;
	
    public static void main( String[] args )
    {
    	firstNumber = 10;
    	secondNumber = 5;
    	
        System.out.println( "My original value for var firstNumber is: " + firstNumber);
        System.out.println( "My original value for var secondNumber is: " + secondNumber);
        
        System.out.println("Reversing the var values without creating a third variable..");
        
        reverseNumericVarValue();
        
        System.out.println( "My new value for var firstNumber is: " + firstNumber);
        System.out.println( "My new value for var secondNumber is: " + secondNumber);
    }

	private static void reverseNumericVarValue() {
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
	}
}
