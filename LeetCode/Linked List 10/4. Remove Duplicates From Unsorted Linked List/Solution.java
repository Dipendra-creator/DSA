// Codestudio Coding Ninjas
// problem: Remove Duplicates From Unsorted Linked List
// https://www.codingninjas.com/codestudio/problems/remove-duplicates-from-unsorted-linked-list_1069331

/************************************************************

    Following is the linked list node structure
    
    class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

************************************************************/

import java.util.*;

public class Solution {

	class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

        // Write your code here
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> nl = null;
        HashSet<Integer> hs = new HashSet<>();
        while (curr != null) {
            if (hs.contains(curr.data)) {
                nl.next = curr.next;
            } else {
                hs.add(curr.data);
                nl = curr;
            }
            curr = curr.next;
        }	
        return head;
	}
}