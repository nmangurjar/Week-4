package resumescreeningsystem;

import java.util.List;

class ResumeScreeningSystem {
    public static void screenResumes(List<? extends JobRole> candidates) {
        for (JobRole candidate : candidates) {
            candidate.displayJobRole();
        }
    }
}

