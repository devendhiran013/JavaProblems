package DataStructure.Tree;

public class binarytree {
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

    binarytree(int val) {
        root = new Node(val);

    }

    public void insertleft(Node r, int val) {
        Node newnode = new Node(val);
        r.left = newnode;

    }

    public void insertright(Node r, int val) {
        Node newnode = new Node(val);
        r.right = newnode;
    }

    public static void preoder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preoder(root.left);
            preoder(root.right);
        }
    }

    public static void inoder(Node root) {
        if (root != null) {
            inoder(root.left);
            System.out.print(root.data + " ");
            inoder(root.right);
        }
    }

    public static void postoder(Node root) {
        if (root != null) {
            postoder(root.left);
            postoder(root.right);
            System.out.print(root.data + " ");

        }
    }

    public int height(Node root) {
        if (root == null) {
            return -1;
        }
        return Math.max(height(root.left),height(root.right));
    }

    public static void main(String[] args) {
        binarytree bt = new binarytree(10);
        bt.insertleft(bt.root, 5);
        bt.insertright(bt.root, 15);
        bt.insertleft(bt.root.left, 3);
        bt.insertright(bt.root.left, 8);
        bt.insertleft(bt.root.right, 12);
        System.out.println("preoder:");
        bt.preoder(bt.root);
        System.out.println();
        System.out.println("inoder");
        bt.inoder(bt.root);
        System.out.println();
        System.out.println("postorder");
        bt.postoder(bt.root);
        System.out.println();
        System.out.println("Height ="+bt.height(bt.root));

    }
}
