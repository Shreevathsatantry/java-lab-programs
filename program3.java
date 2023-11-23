//package program
// DistanceConverter.java (Main class)

import distance.DistanceConverter;
import time.TimeConverter;

public class program3 {
    public static void main(String[] args) {
        // Distance Conversion
        double meters = 1000;
        double miles = 5;

        double a = DistanceConverter.metersToKilometers(meters);
        double milesToKilometers = DistanceConverter.milesToKilometers(miles);

        System.out.println(meters + " meters is equal to " + a + " kilometers");
        System.out.println(miles + " miles is equal to " + milesToKilometers + " kilometers");

        // Time Conversion
        int hours = 2;
        

        int hoursToMinutes = TimeConverter.hoursToMinutes(hours);
        int hoursToSeconds = TimeConverter.hoursToSeconds(hours);

        System.out.println(hours + " hours is equal to " + hoursToMinutes + " minutes");
        System.out.println(hours + " hours is equal to " + hoursToSeconds + " seconds");
    }
}
