package com.sanket;

/**
 * Add 2 Numbers
 *
 */
public class Add
{
    public static void main( String[] args )
    {
        if(args.length > 0){
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			System.out.println( "Addition of the 2 numbers is: " + (number1 + number2) );
        } else {
        	System.out.println( "Input must be 2 numbers" );
        }		
    }
}
