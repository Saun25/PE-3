/*Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
displaying the message stored in the exception object.*/

package com.stackroute;

public class GenerateError {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

        //throws NegativeArraySizeException
        try{
            throw new NegativeArraySizeException();
        }

        //catches NegativeArraySizeException
        catch(NegativeArraySizeException e1){
            System.out.println(e1.toString());
        }


        //throws IndexOutOfBoundsException
        try{
            throw new IndexOutOfBoundsException();
        }

        //catches IndexOutOfBoundsException
        catch (IndexOutOfBoundsException e2){
            System.out.println(e2.toString());
        }


        //throws NullPointerException
        try{
            throw new NullPointerException();
        }

        //catches NullPointerException
        catch(NullPointerException e3){
            System.out.println(e3.toString());
        }
    }
}
