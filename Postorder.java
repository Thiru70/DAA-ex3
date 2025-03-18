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

class Postorder {
    static void postOrder(Node root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        postOrder(root.left, arr);
        postOrder(root.right, arr);
        arr.add(root.data);
    }

    static List<Integer> postorderData(Node root) {
        List<Integer> arr = new ArrayList<>();
        postOrder(root, arr);
        return arr;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result = postorderData(root);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
