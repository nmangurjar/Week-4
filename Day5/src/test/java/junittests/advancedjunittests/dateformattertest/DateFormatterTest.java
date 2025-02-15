package junittests.advancedjunittests.dateformattertest;

import static org.junit.jupiter.api.Assertions.*;

import junit.advancedjunit.testingdateformatter.DateFormatter;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    private final DateFormatter dateFormatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("15-02-2025", dateFormatter.formatDate("2025-02-15"));

    }


}
