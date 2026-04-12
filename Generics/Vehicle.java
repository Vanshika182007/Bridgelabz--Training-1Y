class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T v) {
        fleet.add(v);
    }

    public void showFleet() {
        for (T v : fleet) {
            System.out.println(v.getClass().getSimpleName());
        }
    }
}