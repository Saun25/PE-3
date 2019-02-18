/*Create a class called StudentMarks, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.*/

package com.stackroute;

public class StudentMarks {

    /**
     * The method checkGrade checks whether the grade is between 0 and 100
     * @param numberOfStudents
     * @param grade
     * @return Result
     */

    public String checkGrade(int numberOfStudents,int[] grade){
        String result="";

        //To check and throw error if the value of grade exceeds 100
        for (int i =0;i<numberOfStudents;i++) {

            //try block
            try{
                if(grade[i]<0 || grade[i]>100){
                    throw new Exception();
                }
                else{
                    result="No error";
                }
            }

            //catch block to print error message
            catch (Exception e){
                result="error";
            }
        }

        //return statement
    return result;
    }
}
