package com.travel.agencies.task;

public class StandardPassengerType implements PassengerType{
    @Override
    public boolean canSignUpForActivity(double balance, double cost) {
        return balance >= cost;
    }

    @Override
    public double calculateCost(double originalCost) {
        return originalCost;
    }
}
