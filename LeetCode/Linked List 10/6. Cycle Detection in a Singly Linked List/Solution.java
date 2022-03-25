// Codestudio Coding Ninjas
// problem: Cycle Detection in a Singly Linked List
// https://www.codingninjas.com/codestudio/problems/cycle-detection-in-a-singly-linked-list_628974


/************************************

    Following is the representation of the Singly Linked List node

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }


*****************************************/
import java.util.*;

public class Solution {
    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    // public static boolean detectCycle(Node<Integer> head) {
    //     //Your code goes here
    //     HashSet<Node<Integer>> hs = new HashSet<>();
    //     Node<Integer> curr = head;
    //     while (curr!=null) {
    //         if(!hs.contains(curr)) {
    //             hs.add(curr);
    //         } else {
    //             return true;
    //         }
    //         curr = curr.next;
    //     }
    //     return false;
    // }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean detectCycle(Node<Integer> head) {
        //Your code goes here
        if (head == null || head.next == null) return false;
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }    
}