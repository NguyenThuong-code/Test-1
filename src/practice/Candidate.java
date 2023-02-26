package practice;

public class Candidate extends Person{
    private double gpa;

    public Candidate(int id, String candidateName, String gender, String birthDate, String email, double gpa) {
        super(id, candidateName, gender, birthDate, email);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }



    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + getId() +
                ", candidateName='" + getCandidateName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", gpa='" + getGpa() + '\'' +
                '}';
    }
}
