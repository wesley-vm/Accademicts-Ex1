package com.realdolmen.gitex1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int firstNumber = 10;
    	int secondNumber = 5;
    	
        System.out.println( "My original value for var firstNumber is: " + firstNumber);
        System.out.println( "My original value for var secondNumber is: " + secondNumber);
        
        System.out.println("Reversing the var values without creating a third variable..");
        
        reverseNumericVarValue(firstNumber, secondNumber);
        
        System.out.println( "My new value for var firstNumber is: " + firstNumber);
        System.out.println( "My new value for var secondNumber is: " + secondNumber);
    }

	private static void reverseNumericVarValue(int firstNumber, int secondNumber) {
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = secondNumber - firstNumber;
	}
}
