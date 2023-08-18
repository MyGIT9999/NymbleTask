package com.travel.agencies.task.passenger;

import com.travel.agencies.task.activity.ActivityImp;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private PassengerTypeEnum passengerType;
    private List<ActivityImp> activitiesEnrolled = new ArrayList<>();

    public Passenger(String name, int passengerNumber, double balance, PassengerTypeEnum passengerType) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.passengerType = passengerType;
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public PassengerTypeEnum getPassengerType() {
        return passengerType;
    }

    public List<ActivityImp> getActivitiesEnrolled() {
        return activitiesEnrolled;
    }

    public boolean signUpForActivity(ActivityImp activity) {
        if (activity.getCapacity() > 0) {
            if (passengerType.equals(PassengerTypeEnum.STANDARD)) {
                if (StandardPassengerType.canSignUpForActivity(balance, activity.getCost())) {
                    activitiesEnrolled.add(activity);
                    balance -= activity.getCost();
                    activity.setCapacity(activity.getCapacity() - 1);
                    return true;
                }
            } else if (passengerType.equals(PassengerTypeEnum.GOLD)) {
                if (GoldPassengerType.canSignUpForActivity(balance, activity.getCost())) {
                    activitiesEnrolled.add(activity);
                    balance -= GoldPassengerType.calculateCost(activity.getCost());
                    activity.setCapacity(activity.getCapacity() - 1);
                    return true;
                }
            } else if (passengerType.equals(PassengerTypeEnum.PREMIUM)) {
                activitiesEnrolled.add(activity);
                activity.setCapacity(activity.getCapacity() - 1);
                return true;
            }
        }
        return false;
    }
}
