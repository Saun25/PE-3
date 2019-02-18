/*Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
assume the digits are a string and use split()*/

package com.stackroute;

public class ConsecutiveNumbers {

    /**
     * This method checks whether the given input of numbers are consecutive
     * @param values
     * @return
     */
    public boolean checkconsecutive(String values){
        boolean result = false;
        String[] array= values.split(",");

        //checks the difference and determines if the numbers are consecutive or not
        for (int i=0;i<array.length-1;i++){

            int difference=Integer.parseInt(array[i+1])-Integer.parseInt(array[i]);

            if (difference==1 || difference==-1){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }

        //returns the boolean value
        return result;
    }
}
