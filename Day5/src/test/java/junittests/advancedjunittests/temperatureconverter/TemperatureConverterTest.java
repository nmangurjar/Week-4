package junittests.advancedjunittests.temperatureconverter;

import junit.advancedjunit.testingtemperatureconverter.TemperatureConverter;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private static final double DELTA = 0.01; // Allow small differences for floating-point precision

    @Test

    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0));

    }

    @Test

    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32));

    }
}
