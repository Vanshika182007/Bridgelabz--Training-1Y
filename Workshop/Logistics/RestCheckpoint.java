package com.route.tracker.model;

public class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    public boolean isCritical() {
        return false;
    }

    public String getType() {
        return "RestCheckpoint";
    }

    public double calculatePenalty() {
        if (isDelayed() && (actualDuration - expectedDuration) > 30) {
            return (actualDuration - expectedDuration) * 0.5;
        }
        return 0;
    }
}