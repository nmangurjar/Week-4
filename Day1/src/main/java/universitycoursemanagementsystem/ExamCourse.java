package universitycoursemanagementsystem;

public class ExamCourse extends CourseType {
    private int examWeight;

    public ExamCourse(String courseName, String instructor, int examWeight) {
        super(courseName, instructor);
        this.examWeight = examWeight;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Exam Course: " + getCourseName() + ", Instructor: " + getInstructor() + ", Exam Weight: " + examWeight + "%");
    }
}
