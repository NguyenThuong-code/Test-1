public class Ex1 {
    public static int sumInt(int[] a){
        int sum=0;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] var= {5,2,3,8};
        System.out.println("Sum of m to n: " +sumInt(var));
    }
}
