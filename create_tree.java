/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static class Node{
        int val;
        Node left;
        Node right;
        
        public Node(int val){
            this.val = val;
        }
        
    }
    public static void display (Node root){
            if(root == null ) return;
            System.out.print(root.val+"-> ");
            if(root.left != null ) {
                System.out.print(root.left.val+" ");
            }else{
                System.out.print("N ");
            }
            if(root.right != null ) {
                System.out.print(root.right.val);
            }else{
                System.out.print("N ");
            }
            
            System.out.println();
            display(root.left);
            display(root.right);
        }
	public static void main(String[] args) {
		Node root = new Node(10);
		Node a = new Node(20);
		Node b = new Node(30);
		Node c = new Node(40);
		Node d= new Node(50);
		Node e = new Node(60);
		
		root.left =a;
		root.right = b;
		
		a.right = c;
		a.left = d;
		
		b.right =e;
		display(root);
		
	}
}
