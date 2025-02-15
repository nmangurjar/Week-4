package junit.basicjunittestproblems.testingusingtimeout;

public class TaskUtils {
    public static String longRunningTask() {
        // Simulating a long-running task with computation
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 3000) {
            // Busy-wait for 3 seconds
        }
        return "Task Completed";
    }
}
