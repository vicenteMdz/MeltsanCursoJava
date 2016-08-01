package com.meltsan.cursoJava.tareaUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Hello world!
 *
 */
public class DateUtil 
{
    public static void main( String[] args )
    {
    	 // Create a calendar object and set it time based on the local
        // time zone
        Calendar zonaLocal = Calendar.getInstance();

        // Print the local ate and hour
        System.out.println("Calendar.DATE local: "+zonaLocal.get(Calendar.DATE));
        System.out.println("Calendar.HOUR local: "+zonaLocal.get(Calendar.HOUR));

        // Create a calendar object for representing a Germany time zone. Then we
        // wet the time of the calendar with the value of the local time
        Calendar Europa = new GregorianCalendar(TimeZone.getTimeZone("Europe/Berlin"));
        Europa.setTimeInMillis(zonaLocal.getTimeInMillis());

        //Print the Berlin date and hour
        System.out.println("Calendar.DATE Europa/Berlin: " +Europa.get(Calendar.DATE));
        System.out.println("Calendar.HOUR Europa/Berlin: " +Europa.get(Calendar.HOUR));
    }
}
