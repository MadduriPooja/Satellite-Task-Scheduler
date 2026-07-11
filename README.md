# Satellite-Task-Scheduler
A Java-based simulation that manages satellite tasks using a Priority Queue (DSA). It handles resource management (battery power) and simulates solar charging cycles to prioritize critical operations like emergency thrusters.

🧩 DSA Concepts Used
1.Priority Queue (Heap) → Efficient scheduling of tasks by priority.
2.Queue Operations → Enqueue/Dequeue tasks for execution order.
3.Greedy Strategy → Always execute the most critical task first.
4.Simulation & State Management → Models real-world constraints like battery drain and recharge.

📊 Complexity Analysis
1.Insert Task → 𝑂(log𝑛)
2.Execute Task → 𝑂(log𝑛)
3.Battery Check & Update → 𝑂(1)
4.Overall Simulation → 𝑂(𝑛log𝑛)
