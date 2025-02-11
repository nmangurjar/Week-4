package resumescreeningtest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import resumescreeningsystem.DataScientist;
import resumescreeningsystem.SoftwareEngineer;

import java.util.Arrays;
import java.util.List;

class ResumeTest {
    @Test
    void testSoftwareEngineerResume() {
        SoftwareEngineer seCandidate = new SoftwareEngineer("om", "Java, Spring Boot, Microservices");
        assertEquals("om", seCandidate.getCandidateName());
    }

    @Test
    void testDataScientistResume() {
        DataScientist dsCandidate = new DataScientist("naman", "Python, Machine Learning, Data Analysis");
        assertEquals("naman", dsCandidate.getCandidateName());
    }


}