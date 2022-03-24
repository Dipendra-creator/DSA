// Codestudio Coding Ninjas
// problem: Merge Two Sorted Linked Lists 
// https://www.codingninjas.com/codestudio/problems/merge-two-sorted-linked-lists_800332
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        if (first == null) return second;
        if (second == null) return first;
        if (first.data < second.data) {
            first.next = sortTwoLists(first.next, second);
            return first;
        } else {
            second.next = sortTwoLists(first, second.next);
            return second;
        }
	}
}
