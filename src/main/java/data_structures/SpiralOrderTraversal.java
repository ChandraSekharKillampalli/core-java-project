package data_structures;

import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class SpiralOrderTraversal {
    void printSpiral(Node root) {
        if (root == null) return;

        Deque<Node> deque = new ArrayDeque<>();
        deque.add(root);
        boolean leftToRight = false;

        while (!deque.isEmpty()) {
            int levelSize = deque.size();

            for (int i = 0; i < levelSize; i++) {
                if (leftToRight) {
                    Node node = deque.pollFirst();
                    System.out.print(node.data + " ");
                    if (node.left != null) deque.addLast(node.left);
                    if (node.right != null) deque.addLast(node.right);
                } else {
                    Node node = deque.pollLast();
                    System.out.print(node.data + " ");
                    if (node.right != null) deque.addFirst(node.right);
                    if (node.left != null) deque.addFirst(node.left);
                }
            }
            leftToRight = !leftToRight; // toggle direction
        }
    }

    public static void main(String[] args) {
        SpiralOrderTraversal tree = new SpiralOrderTraversal();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);

        tree.printSpiral(root);
    }
}

