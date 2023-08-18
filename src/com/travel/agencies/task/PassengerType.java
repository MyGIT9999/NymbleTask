package com.travel.agencies.task;

public interface PassengerType {
    boolean canSignUpForActivity(double balance, double cost);
    double calculateCost(double originalCost);
}
