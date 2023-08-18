package com.travel.agencies.task;

import com.travel.agencies.task.activity.ActivityImp;
import com.travel.agencies.task.destination.Destination;
import com.travel.agencies.task.passenger.Passenger;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary = new ArrayList<>();
    private List<Passenger> passengersEnrolled = new ArrayList<>();

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (passengersEnrolled.size() < passengerCapacity) {
            passengersEnrolled.add(passenger);
        }
    }
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (ActivityImp activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName() +
                        ", Description: " + activity.getDescription() +
                        ", Cost: " + activity.getCost() +
                        ", Capacity: " + activity.getCapacity());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengersEnrolled.size());
        for (Passenger passenger : passengersEnrolled) {
            System.out.println("Passenger Name: " + passenger.getName() +
                    ", Number: " + passenger.getPassengerNumber());
        }
    }
}
