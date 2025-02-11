package universitycoursemanagementsystem;

class AssignmentCourse extends CourseType {
    private int assignmentsCount;

    public AssignmentCourse(String courseName, String instructor, int assignmentsCount) {
        super(courseName, instructor);
        this.assignmentsCount = assignmentsCount;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Assignment Course: " + getCourseName() + ", Instructor: " + getInstructor() + ", Assignments: " + assignmentsCount);
    }
}
