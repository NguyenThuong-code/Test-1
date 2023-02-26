package candidate;

public class Main {
    public static void main(String[] args) {
        CandidateManagement cm=new CandidateManagement();
        for (int i = 0; i < cm.createCandidate().length; i++) {
            System.out.println(cm.createCandidate().length);
        }
//        Candidate[] candidates=new Candidate[1];
//     candidates[0]= new Candidate(1,"thuong","male","01-12-1999","thuong@gmail.com",2.9);
//        cm.createCandidate();
//       cm.display(candidates);
    }
}
