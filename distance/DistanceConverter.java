// distance/DistanceConverter.java

package distance;

public class DistanceConverter {
    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
