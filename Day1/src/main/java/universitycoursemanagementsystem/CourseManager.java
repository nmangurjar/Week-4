package universitycoursemanagementsystem;

import java.util.List;

class CourseManager {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayCourseDetails();
        }
    }
}