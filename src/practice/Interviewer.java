package practice;

public class Interviewer extends Person{
    private int experience;

    public Interviewer(int id, String candidateName, String gender, String birthDate, String email, int experience) {
        super(id, candidateName, gender, birthDate, email);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "interviewer{" +
                "id=" + getId() +
                ", candidateName='" + getCandidateName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", gpa='" + getExperience() + '\'' +
                '}';
    }
}
