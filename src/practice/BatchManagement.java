package practice;

import java.util.ArrayList;
import java.util.List;

public class BatchManagement {
    public Batch createBatch(){
        Batch batches= new Batch();
        return batches;
    }
    public void display(Batch[] batches){
        for (int i = 0; i < batches.length; i++) {
            System.out.println(batches[i].toString());
        }
    }
}
