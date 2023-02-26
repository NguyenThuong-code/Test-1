package candidate;

public class CandidateManagement {
    public Candidate[] createCandidate(){
        Candidate[] candidates=new Candidate[1];
       candidates[0]= new Candidate(1,"thuong","male","01-12-1999","thuong@gmail.com",2.9);
        return candidates;
    }
    public void display(Candidate[] candidates){
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i].toString());;
        }
    }
}
