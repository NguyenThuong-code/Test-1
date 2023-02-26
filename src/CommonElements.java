public class CommonElements {
    public static void main(String[] args) {
        int[] myIntArray1={43,32,53};
        int[] myIntArray2={43,13,72,53};
        for (int i = 0; i < myIntArray1.length; i++) {
            for (int j = 0; j < myIntArray2.length; j++) {
                if (myIntArray1[i]==myIntArray2[j]){
                    System.out.println("common element: "+ myIntArray1[i]);
                }
            }
        }
    }

}
