package resumescreeningsystem;

public class DataScientist extends JobRole {
    public DataScientist(String candidateName, String resumeContent) {
        super(candidateName, resumeContent);
    }


    public void displayJobRole() {
        System.out.println("Data Scientist Candidate: " + getCandidateName());
    }
}
