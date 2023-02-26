import java.util.Scanner;

public class FrequentNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length");
        int len= sc.nextInt();
        int[] arr= new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value "+i);
            arr[i]= sc.nextInt();
            System.out.println("Do you want to continue?");
            sc.nextLine();
            String choose = sc.nextLine();
            if (choose.equals("N"))
                break;
            else
                continue;
        }
        boolean check = true;
        System.out.println("Enter value to check: ");
        int value =sc.nextInt();
        int count=0;
        String temp="Position: ";
        for (int i = 0; i < arr.length; i++) {
            if (value==arr[i]){
                temp= temp+String.valueOf(i)+"\t";
                check= true;
                count++;
            }else {
                check= false;
            }


        }
        System.out.println("Amount of frequence: "+ count);
        System.out.println(temp);
    }
}
