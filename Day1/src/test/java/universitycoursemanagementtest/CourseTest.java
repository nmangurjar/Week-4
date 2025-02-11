package universitycoursemanagementtest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import universitycoursemanagementsystem.ExamCourse;

import java.util.Arrays;
import java.util.List;

class CourseTest {
    @Test
    void testExamCourseDetails() {
        ExamCourse examCourse = new ExamCourse("Mathematics", "Dr. Manoj", 70);
        assertEquals("Mathematics", examCourse.getCourseName());
        assertEquals("Dr. Manoj", examCourse.getInstructor());
    }
}