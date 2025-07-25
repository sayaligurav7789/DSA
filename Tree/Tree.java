package Tree;
import java.util.Scanner;

public class Tree{

   
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

   
    
    public static Node buildTree(Scanner sc) {
        System.out.print("Enter node value: ");
        int value = sc.nextInt();

        if (value == -1) return null;

        Node newNode = new Node(value);
        System.out.println("Enter left child of " + value);
        newNode.left = buildTree(sc);

        System.out.println("Enter right child of " + value);
        newNode.right = buildTree(sc);

        return newNode;
    }

  
    public static void inorderTraversal(Node node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    
    public static void preorderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }


    public static void postorderTraversal(Node node) {
        if (node == null) return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Construct the binary tree (Use -1 to indicate no node):");
        Node root = buildTree(sc);

        System.out.println("\nInorder Traversal:");
        inorderTraversal(root);

        System.out.println("\nPreorder Traversal:");
        preorderTraversal(root);

        System.out.println("\nPostorder Traversal:");
        postorderTraversal(root);
    }
}