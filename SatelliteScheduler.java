import java.util.PriorityQueue;

public class SatelliteScheduler {
    public static void main(String[] args) {
        int battery = 30; // Starts low, as if in Earth's shadow
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Adding tasks to the system
        taskQueue.add(new Task("System Log", 1, 5));
        taskQueue.add(new Task("Camera Capture", 5, 30));
        taskQueue.add(new Task("Emergency Thruster", 10, 20));

        System.out.println("Starting Mission Simulation. Initial Battery: " + battery);

        while (!taskQueue.isEmpty()) {
            Task currentTask = taskQueue.poll();
            
            // Solar charging simulation: Gain power as we orbit
            battery += 15; 
            System.out.println("\nSolar panels active. Battery charged to: " + battery);

            // Logic check: Is there enough power to execute?
            if (battery >= currentTask.cost) {
                battery -= currentTask.cost;
                System.out.println("Executing: " + currentTask.name + " | Remaining Battery: " + battery);
            } else {
                System.out.println("Skipping: " + currentTask.name + " (Insufficient Power)");
            }
        }
        System.out.println("\nMission Complete.");
    }
}