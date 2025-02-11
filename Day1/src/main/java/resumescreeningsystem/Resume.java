package resumescreeningsystem;

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        jobRole.displayJobRole();
        System.out.println("Resume Content: " + jobRole.getResumeContent());
    }
}
