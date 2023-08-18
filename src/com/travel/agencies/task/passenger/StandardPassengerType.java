package com.travel.agencies.task.passenger;

public class StandardPassengerType  {

    public static boolean canSignUpForActivity(double balance, double cost) {
        return balance >= cost;
    }


    public static double calculateCost(double originalCost) {
        return originalCost;
    }
}
