package universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExamCourse examCourse = new ExamCourse("Mathematics", "Dr. Manoj", 70);
        AssignmentCourse assignmentCourse = new AssignmentCourse("Programming", "Prof. sharma", 5);
        ResearchCourse researchCourse = new ResearchCourse("AI Research", "Dr. pooja", "Neural Networks");

        Course<ExamCourse> course1 = new Course<>(examCourse);
        Course<AssignmentCourse> course2 = new Course<>(assignmentCourse);
        Course<ResearchCourse> course3 = new Course<>(researchCourse);

        course1.showCourseInfo();
        course2.showCourseInfo();
        course3.showCourseInfo();

        // Using CourseManager with wildcard
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(examCourse);
        allCourses.add(assignmentCourse);
        allCourses.add(researchCourse);

        System.out.println("\nDisplaying all courses using CourseManager:");
        CourseManager.displayAllCourses(allCourses);
    }
}
