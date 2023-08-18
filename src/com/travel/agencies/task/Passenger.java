package com.travel.agencies.task;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private PassengerType passengerType;
    private List<Activity> activitiesEnrolled = new ArrayList<>();

    public Passenger(String name, int passengerNumber, double balance, PassengerType passengerType) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.passengerType = passengerType;
    }

    public void signUpForActivity(Activity activity) {
        if (activity.getCapacity() > 0) {
            if (passengerType.canSignUpForActivity(balance, activity.getCost())) {
                activitiesEnrolled.add(activity);
                balance -= passengerType.calculateCost(activity.getCost());
                activity.setCapacity(activity.getCapacity() - 1);
            }
        }
    }
}
