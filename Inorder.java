import java.util.ArrayList;
import java.util.List;

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

class Inorder {
    static void inOrder(Node root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
        
    }

    static List<Integer> inorderData(Node root) {
        List<Integer> arr = new ArrayList<>();
        inOrder(root, arr);
        return arr;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result = inorderData(root);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
