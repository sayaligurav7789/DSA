package Tree;
import java.util.Scanner;

class BinarySearchTree {

    public BinarySearchTree() {
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert value into BST
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }
        // If value is equal, ignore or handle duplicates as needed
        return node;
    }

    // Display tree in simple indented format
public void displayBST() {
    displayBST(root, 0);
}

private void displayBST(Node node, int level) {
    if (node == null) {
        return;
    }
    displayBST(node.right, level + 1);
    for (int i = 0; i < level; i++) {
        System.out.print("    "); // 4 spaces indentation
    }
    System.out.println(node.value);
    displayBST(node.left, level + 1);
}


    // PreOrder Traversal
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // InOrder Traversal
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // PostOrder Traversal
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        System.out.print("How many nodes do you want to insert? ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " values to insert in BST:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            bst.insert(value);
        }

        System.out.println("\nTree Display:");
        bst.displayBST();

        System.out.println("\nPreOrder Traversal:");
        bst.preOrder();

        System.out.println("\n\nInOrder Traversal:");
        bst.inOrder();

        System.out.println("\n\nPostOrder Traversal:");
        bst.postOrder();

        scanner.close();
    }
}

