package com.travel.agencies.task.destination;

import com.travel.agencies.task.activity.ActivityImp;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<ActivityImp> activities = new ArrayList<>();

    public Destination(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<ActivityImp> getActivities() {
        return activities;
    }

    public void addActivity(ActivityImp activity) {
        activities.add(activity);
    }

}
