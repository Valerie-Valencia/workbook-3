package org.example;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter dateTimeSlash = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dateTimeDash = DateTimeFormatter.ofPattern("yyy-MM-dd");
        DateTimeFormatter dateTimeChar = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter dateTimeWeek = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        DateTimeFormatter dateTimeHour = DateTimeFormatter.ofPattern("hh:mm 'on' dd-MMM-yyyy");

        String dateSlash = timeNow.format(dateTimeSlash);
        String dateDash = timeNow.format(dateTimeDash);
        String dateChar = timeNow.format(dateTimeChar);
        String dateWeek = timeNow.format(dateTimeWeek);
        String dateHour = timeNow.format(dateTimeHour);

        //dateTimeHour.getZone();

        System.out.println(dateSlash + "\n" + dateDash + "\n" + dateChar + "\n" + dateWeek + "\n" + dateHour);
    }
}