package com.travel.agencies.task;

public class GoldPassengerType implements PassengerType{
    @Override
    public boolean canSignUpForActivity(double balance, double cost) {
        return balance >= cost * 0.9;
    }

    @Override
    public double calculateCost(double originalCost) {
        return originalCost * 0.9;
    }
}
