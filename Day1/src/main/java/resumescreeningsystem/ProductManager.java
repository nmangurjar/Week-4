package resumescreeningsystem;

class ProductManager extends JobRole {
    public ProductManager(String candidateName, String resumeContent) {
        super(candidateName, resumeContent);
    }


    public void displayJobRole() {
        System.out.println("Product Manager Candidate: " + getCandidateName());
    }
}