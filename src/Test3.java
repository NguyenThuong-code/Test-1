public class Test3 {
    public static int count(int a[], int n,int i){
        int count =0;
        for (int j = 0; j < n; j++) {
            if (a[j]==i)
                count++;
        }
        return (count);
    }
    public static void sort(int a[]){
        int temp=a[0];
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;

                }
            }
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {

        int[] n ={3,5,3,7,8,6,1,5};
        System.out.println("bai 1");
        for (int i = 0; i < n.length; i++) {
           if (count(n,n.length, n[i])==1)
               System.out.println(n[i]);
        }
        System.out.println("Bai 2");
        sort(n);
//        for (int j = 0; j < n.length-1; j++) {
//            for (int i = 1; i < n.length-1-j; i++) {
//                if(n[j]!=n[ i+j]){
//                    System.out.println(n[i]);
//                }
//            }
//        }
    }
}
