package practice;

public class Main {
    public static void main(String[] args) {
        BatchManagement bm= new BatchManagement();
        Interviewer interviewer= new Interviewer(1,"cute", "Male","10-9-1993","cute@gmail.com",3);
        Candidate[] candidates={
                new Candidate(1,"thuong","Male","01-12-1998","thuong@gmail.com", 3.0),
                new Candidate(2,"Ngan","Female", "10-10-1999","ngan@gmail.com", 3.5)
        };
        Batch[] batch= {new Batch("java", "01-03-2023", interviewer, candidates)};
        bm.display(batch);
    }
}
