import java.util.*;

class InvalidBookingException extends Exception {
    InvalidBookingException(String message) {
        super(message);
    }
}

abstract class Vehicle {

    abstract int calculateFare(int distance);
}

class Bike extends Vehicle {

    @Override
    int calculateFare(int distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {

    @Override
    int calculateFare(int distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {

    @Override
    int calculateFare(int distance) {
        return distance * 12;
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}

class Rider {
    String name;

    Rider(String name) {
        this.name = name;
    }
}

class Trip {

    private Driver driver;
    private Rider rider;
    private Vehicle vehicle;
    private int distance;

    Trip(Driver driver, Rider rider, Vehicle vehicle, int distance)
            throws InvalidBookingException {

        if (distance <= 0) {
            throw new InvalidBookingException(
                "Invalid distance"
            );
        }

        this.driver = driver;
        this.rider = rider;
        this.vehicle = vehicle;
        this.distance = distance;
    }

    int getFare() {
        return vehicle.calculateFare(distance);
    }

    Driver getDriver() {
        return driver;
    }

    Rider getRider() {
        return rider;
    }

    Vehicle getVehicle() {
        return vehicle;
    }
}

public class ridesharingplatfromsimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Driver driver = new Driver("Driver");
        Rider rider = new Rider("Rider");

        for (int i = 0; i < N; i++) {

            String type = sc.next();
            int distance = sc.nextInt();

            try {

                Vehicle vehicle;

                if (type.equals("Bike")) {
                    vehicle = new Bike();
                }
                else if (type.equals("Auto")) {
                    vehicle = new Auto();
                }
                else if (type.equals("Cab")) {
                    vehicle = new Cab();
                }
                else {
                    throw new InvalidBookingException(
                        "Invalid ride type"
                    );
                }

                Trip trip = new Trip(
                    driver,
                    rider,
                    vehicle,
                    distance
                );

                System.out.println(trip.getFare());

            }
            catch (InvalidBookingException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}