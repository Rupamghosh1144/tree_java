/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int size = 0;
    public static class Node{
        int val;
        Node left;
        Node right;
        
        public Node(int val){
            this.val = val;
        }
        
    }
    public static void preOrder (Node root){
        if(root == null ) return;
        System.out.print(root.val+" ");
        size++;
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root ==  null ) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root  ==  null ) return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static int size(Node root){
        if(root ==  null ) return 0;
        return 1+ size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if (root ==  null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int max(Node root){
        if(root == null ) return Integer.MIN_VALUE;
        int leftmax = max(root.left);
        int rightmax = max(root.right);
        return Math.max(root.val , Math.max(leftmax, rightmax));
    }
    public static int height(Node root){
        if(root ==  null ) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left),min(root.right)));
    }
    public static int product(Node root){
    if(root == null) return 1;  
    return root.val * product(root.left) * product(root.right);
    }
    public static void print_nth_level(Node root, int num){
        if(root == null ) return;
        if(num == 1) System.out.print(root.val+" ");
        print_nth_level(root.left, num-1);
        print_nth_level(root.right,num-1);
    }
    public static void bfs(Node root){
        Queue<Node> q= new LinkedList<>();
        if(root != null ) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
	public static void main(String[] args) {
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d= new Node(5);
		Node e = new Node(6);
		Node f= new Node(7);
		
		root.left =a;
		root.right = b;
		
		a.right = c;
		a.left = d;
		
		b.right =e;
		
		e.left = f;
		
// 		System.out.println("PreOrder Travaersal");
// 		preOrder(root);
		
// 		System.out.println(size);

        //the size of the tree is: 
        System.out.println(size(root));
        
        //the sum of the tree is
        System.out.println(sum(root));
        
        //the maximum element in the tree is
        System.out.println(max(root));
        
        //the height of the tree is
        System.out.println(height(root));
        
        //the minimum value of the tree is
        System.out.println(min(root));
        
        //the product of the tree is
        System.out.println(product(root));
        
        //inorder Travaersal
        inOrder(root);
        
        System.out.println();
        //postOrder Travaersal
        postOrder(root);
        
        System.out.println();
        //print n th lavel in the tree
        print_nth_level(root, 3);
        
        System.out.println();
        System.out.println("level oreder: ");
        //level order Travaersal
        int level = height(root)+1;
        for(int i=1;i<=level;i++){
            print_nth_level(root,i);
            System.out.println();
        }
        
        
        
        //bfs
        System.out.println("BFS:");
        bfs(root);
		
	}
}
