package DataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binarytreee {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    Binarytreee() {
        root = null;
    }

    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    public Node insertRecursive(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.data) {
            root.right = insertRecursive(root.right, val);
        }

        return root;
    }

    public void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    // Preorder traversal
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Inorder traversal
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Postorder traversal
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public int height(Node root) {
        if (root == null) {
            return -1;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (root.data < key) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    public int leafCount(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return leafCount(root.left) + leafCount(root.right);
    }

    public static void main(String[] args) {
        Binarytreee bt = new Binarytreee();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to insert into the binary tree (type 'exit' to stop):");
        int n = scanner.nextInt();
        while (n > 0) {

            bt.insert(n);
            n = scanner.nextInt();
        }

        // Traversal outputs
        System.out.println("Level order");
        bt.levelorder(bt.root);
        System.out.println();
        System.out.println("Preorder:");
        bt.preorder(bt.root);
        System.out.println();
        System.out.println("Inorder:");
        bt.inorder(bt.root);
        System.out.println();
        System.out.println("Postorder:");
        bt.postorder(bt.root);
        System.out.println();
        System.out.println("Height = " + bt.height(bt.root));

        System.out.println("Leaf Count = " + bt.leafCount(bt.root));
        System.out.println("Enter element to search:");
        int search = scanner.nextInt();
        Node result = bt.search(bt.root, search);
        if (result != null) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        scanner.close();
    }
}
