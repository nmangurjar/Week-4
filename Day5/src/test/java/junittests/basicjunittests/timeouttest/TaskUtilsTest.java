package junittests.basicjunittests.timeouttest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.basicjunittestproblems.testingusingtimeout.TaskUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskUtilsTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Test should fail if execution takes more than 2 sec
    void testLongRunningTask() {
        assertEquals("Task Completed", TaskUtils.longRunningTask());
    }
}
