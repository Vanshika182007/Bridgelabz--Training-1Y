import java.util.*;

public class Sensor {

    public static void logData(Double value) {
        System.out.println("Stored: " + value);
    }

    public static void main(String[] args) {
        double primitive = 25.5;
        Double wrapper = 30.2;

        logData(primitive); // auto-boxing
        logData(wrapper);

        double read = wrapper; // auto-unboxing
        System.out.println("Read value: " + read);
    }
}