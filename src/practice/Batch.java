package practice;

import java.util.Arrays;

public class Batch {
    private String batchName;
    private String batchDate;
    private Interviewer interviewer;
    private Candidate[] candidates;

    public Batch() {
    }

    public Batch(String batchName, String batchDate, Interviewer interviewer, Candidate[] candidates) {
        this.batchName = batchName;
        this.batchDate = batchDate;
        this.interviewer = interviewer;
        this.candidates = candidates;
    }

    public Batch(String batchName, String batchDate) {
        this.batchName = batchName;
        this.batchDate = batchDate;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(String batchDate) {
        this.batchDate = batchDate;
    }

    public Interviewer getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    public Candidate[] getCandidates() {
        return candidates;
    }

    public void setCandidates(Candidate[] candidates) {
        this.candidates = candidates;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchName='" + batchName + '\'' +
                ", batchDate='" + batchDate + '\'' +
                ", interviewer=" + interviewer.toString() +
                ", candidates=" + Arrays.toString(candidates) +
                '}';
    }
}
