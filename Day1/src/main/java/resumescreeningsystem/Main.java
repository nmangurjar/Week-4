package resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SoftwareEngineer seCandidate = new SoftwareEngineer("Naman", "Java, Spring Boot, Mern");
        DataScientist dsCandidate = new DataScientist("om", "Python, Machine Learning, Data Analysis");
        ProductManager pmCandidate = new ProductManager("Ishan", "C++, Market Research, Leadership");

        Resume<SoftwareEngineer> resume1 = new Resume<>(seCandidate);
        Resume<DataScientist> resume2 = new Resume<>(dsCandidate);
        Resume<ProductManager> resume3 = new Resume<>(pmCandidate);

        resume1.processResume();
        resume2.processResume();
        resume3.processResume();

        // Screening resumes using wildcard method
        List<JobRole> allCandidates = new ArrayList<>();
        allCandidates.add(seCandidate);
        allCandidates.add(dsCandidate);
        allCandidates.add(pmCandidate);

        System.out.println("\nScreening Resumes:");
        ResumeScreeningSystem.screenResumes(allCandidates);
    }
}