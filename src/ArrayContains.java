import java.util.Scanner;

public class ArrayContains {

public static void isContain(String s, String[] a){
    for (int i = 0; i < a.length; i++) {
        if (s.contains(a[i])){
            System.out.println("Contained!");
            break;
        }else if(i== a.length-1)
            System.out.println("not contained");
    }
    }

    public static void main(String[] args) {
        int a=4;
        String[] n;
        Scanner sc=new Scanner(System.in);
        n=new String[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Enter array" +i +": ");
            n[i]= sc.nextLine();
        }
        System.out.println("Enter Array to check list: ");
        String sValue = sc.nextLine();
            isContain(sValue, n);


    }
}
