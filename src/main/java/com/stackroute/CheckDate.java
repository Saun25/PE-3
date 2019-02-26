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
        String string;

        Calendar calendar = Calendar.getInstance();

// Set the calendar to monday of the current week
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        string = dateFormat.format(calendar.getTime());

        if (string.equals("Mon 18/02/2019")) {
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
        String string;

        Calendar calender = Calendar.getInstance();

// Set the calendar to monday of the current week
        calender.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        calender.add(Calendar.DATE,6);
        string = (dateFormat.format(calender.getTime()));

        if(string.equals("Sun 24/02/2019")) {
            result=true;
        }
        else {
            result=false;
        }
    return result;
    }
}
