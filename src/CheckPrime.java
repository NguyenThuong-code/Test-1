public class CheckPrime {
    public static void main(String[] args) {
        int n= 40;
        boolean check =true;

        for (int i = 2; i <Math.sqrt(n); i++) {
if(n%i==0){
    check= false;
}

        }
        if (check){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
