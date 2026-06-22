public class Task implements Comparable<Task> {
    String name;
    int priority; // Higher number = Higher priority
    int cost;     // Power cost

    public Task(String name, int priority, int cost) {
        this.name = name;
        this.priority = priority;
        this.cost = cost;
    }

    // This helps the PriorityQueue decide which task is more important
    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority);
    }
}