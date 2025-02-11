package universitycoursemanagementsystem;

                                                                                class Course<T extends CourseType> {
                                                                                    private T courseType;

                                                                                    public Course(T courseType) {
                                                                                        this.courseType = courseType;
                                                                                    }

                                                                                    public void showCourseInfo() {
                                                                                        courseType.displayCourseDetails();
                                                                                    }
                                                                                }
