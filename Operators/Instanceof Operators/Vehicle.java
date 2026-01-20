class Vehicle {}

class Car extends Vehicle {}

public class CheckInstance {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        String text = "Gemini";

        boolean isCar = myVehicle instanceof Car;
        boolean isVehicle = myVehicle instanceof Vehicle;
        boolean isString = text instanceof String;

        System.out.println(isCar);
        System.out.println(isVehicle);
        System.out.println(isString);
    }
}