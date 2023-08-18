package com.travel.agencies.task;

import com.travel.agencies.task.activity.ActivityImp;
import com.travel.agencies.task.destination.Destination;
import com.travel.agencies.task.passenger.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Destination beach = new Destination("Beach Paradise");
        Destination mountain = new Destination("Mountain Retreat");

        ActivityImp snorkeling = new ActivityImp("Snorkeling", "Explore underwater life", 50, 10);
        ActivityImp sunbathing = new ActivityImp("Table tennise", "Relax on the beach", 20, 20);
        ActivityImp hiking = new ActivityImp("Wallyball", "Kings always wins", 30, 15);

        beach.addActivity(snorkeling);
        beach.addActivity(sunbathing);
        mountain.addActivity(hiking);

        TravelPackage summerGetaway = new TravelPackage("Summer Getaway", 3);
        summerGetaway.addDestination(beach);
        summerGetaway.addDestination(mountain);

        Passenger alice = new Passenger("Jay", 101, 100, PassengerTypeEnum.STANDARD);
        Passenger bob = new Passenger("Parth", 102, 200, PassengerTypeEnum.GOLD);
        Passenger charlie = new Passenger("Meet", 103, 0, PassengerTypeEnum.PREMIUM);

        summerGetaway.addPassenger(alice);
        summerGetaway.addPassenger(bob);
        summerGetaway.addPassenger(charlie);

        alice.signUpForActivity(snorkeling);
        alice.signUpForActivity(hiking);
        bob.signUpForActivity(sunbathing);
        charlie.signUpForActivity(snorkeling);

        summerGetaway.printItinerary();
        summerGetaway.printPassengerList();
    }
}
