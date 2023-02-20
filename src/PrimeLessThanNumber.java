public class PrimeLessThanNumber {
    public static void main(String[] args) {
        int n=0;
        while (n<100){
            boolean check= true;
            if (n<2){
                check=false;
            }
            for (int i = 2; i <=Math.sqrt(n); i++) {
if (n%i==0){
    check=false;
}
            }
            if (check){
                System.out.println(n);
                n++;
            }else {
                n++;
            }
        }
    }
}
