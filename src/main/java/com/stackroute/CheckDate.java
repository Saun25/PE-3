/*Write a java program to calculate first and last date of a week.*/

package com.stackroute;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CheckDate {

    /**
     * this method returns the starting date of the week.
     * @return
     */
    public boolean startDate() {
        boolean result=false;
        String s1;

        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        s1 = df.format(c.getTime());

        if (s1.equals("Mon 18/02/2019")) {
            result=true;
        } else {
            result=false;
        }
        return result;
    }

    /**
     * This method calculates the end date of the week.
     * @return boolean
     */
    public boolean endDate() {
        boolean result;
        String s2="";

        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        c.add(Calendar.DATE,6);
        s2 = (df.format(c.getTime()));

        if(s2.equals("Sun 24/02/2019")) {
            result=true;
        }
        else {
            result=false;
        }
    return result;
    }
}
