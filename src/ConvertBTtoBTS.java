import java.util.Arrays;

public class ConvertBTtoBTS {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    public Node root;
    int[] treeArray;
    int index=0;
    public ConvertBTtoBTS(){
        root=null;
    }
    public Node convertBTBST(Node node){
        int treeSize= calculateSize(node);
        treeArray= new int[treeSize];
        convertBTBST(node);
        Arrays.sort(treeArray);
        Node d =createBTS(0, treeArray.length-1);
        return d;
    }

    private Node createBTS(int i, int i1) {
        if (i>i1){
            return null;
        }
        int mid =(i+i1)/2;
        Node node= new Node(treeArray[mid]);
        node.left=createBTS(i,mid-1);
        node.right=createBTS(mid+1,i1);
        return node;
    }

    private int calculateSize(Node node) {
        int size=0;
        if (node==null)
            return 0;
        else {
            size= calculateSize(node.left)+calculateSize(node.right)+1;
            return size;
        }
    }
    public void convertBTtoArray(Node node){
        if (root==null){
            System.out.println("Tree is empty");
            return;
        }else {
            if (node.left!=null)
                convertBTtoArray(node.left);
            treeArray[index]=node.data;
            index++;
            if (node.right!=null)
                convertBTtoArray(node.right);
        }
    }
   public void inorderTraversal(Node node){
        if (root==null){
            System.out.println("Tree is empty");
            return;
        }else {
            if(node.left!=null)
                inorderTraversal(node.left);
            System.out.println(node.data+" ");
            if (node.right!=null)
                inorderTraversal(node.right);
        }
   }

    public static void main(String[] args) {

    }
}
