package com.route.tracker.driver;

import com.route.tracker.linkedlist.RouteLinkedList;
import com.route.tracker.model.Checkpoint;

public class Driver {

    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");

        routeHistory.printRoute();

        double distance = routeHistory.computeTotalDistance();
        double penalty = routeHistory.computeTotalPenalty();
        double score = distance - penalty;

        System.out.println("Total Distance: " + distance + " km");
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);

        System.out.println("Critical Route Check: " +
                (routeHistory.checkCritical() ? "All required checkpoints present" : "Missing critical checkpoints"));
    }
}