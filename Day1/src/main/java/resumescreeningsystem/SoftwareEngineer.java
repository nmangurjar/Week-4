package resumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String resumeContent) {
        super(candidateName, resumeContent);
    }


    public void displayJobRole() {
        System.out.println("Software Engineer Candidate: " + getCandidateName());
    }
}