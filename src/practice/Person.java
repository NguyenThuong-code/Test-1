package practice;

public class Person {
    private int id;
    private String candidateName;
    private String gender;
    private String  birthDate;
    private String email;

    public Person() {
    }

    public Person(int id, String candidateName, String gender, String birthDate, String email) {
        this.id = id;
        this.candidateName = candidateName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", candidateName='" + candidateName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
