/*Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a String argument.
b. Catch the exception inside a catch clause and print the String argument.
c. Add a finally clause and print a message to prove you were there.*/

package com.stackroute;

import java.sql.SQLOutput;

public class UserDefinedExecption {
    /**
     * main method
     * @param args
     */
    public static void  main(String [] args)
    {
        //try block: an object of Exception class is thrown
        try {
            throw new Exception();
        }

        //catch block:catches the exception and prints the String argument
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

        //finally block:prints a message
        finally {
            System.out.println("Executing finally block");
        }

    }
}
