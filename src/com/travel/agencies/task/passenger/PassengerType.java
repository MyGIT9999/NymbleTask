package com.travel.agencies.task.passenger;

public interface PassengerType {
    boolean canSignUpForActivity(double balance, double cost);
    double calculateCost(double originalCost);
}
