package junittests.advancedjunittests.passwordstrengthtest;

import junit.advancedjunit.testingpasswordstrength.PasswordValidator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    @DisplayName("Valid Password")
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongP4ss"), "Password should be valid");
    }

    @Test
    @DisplayName("Invalid Password - Less than 8 characters")
    void testShortPassword() {
        assertFalse(PasswordValidator.isValid("Abc1"), "Password should be invalid (too short)");
    }

    @Test
    @DisplayName("Invalid Password - No Uppercase Letter")
    void testNoUppercaseLetter() {
        assertFalse(PasswordValidator.isValid("weakpass1"), "Password should be invalid (no uppercase letter)");
    }

    @Test
    @DisplayName("Invalid Password - No Digit")
    void testNoDigit() {
        assertFalse(PasswordValidator.isValid("NoDigitsHere"), "Password should be invalid (no digit)");
    }

    @Test
    @DisplayName("Invalid Password - Null Input")
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null), "Password should be invalid (null input)");
    }

    @Test
    @DisplayName("Invalid Password - Empty String")
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValid(""), "Password should be invalid (empty string)");
    }
}

