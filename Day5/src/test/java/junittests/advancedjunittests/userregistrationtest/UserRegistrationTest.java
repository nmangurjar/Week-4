package junittests.advancedjunittests.userregistrationtest;
import java.util.regex.Pattern;

import junit.advancedjunit.testinguserregistration.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {


    @Test
    public void testInvalidUsername() {
        UserRegistration registration = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "test@example.com", "password123"));
    }

}

