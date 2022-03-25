// Codestudio Coding Ninjas
// problem: Palindrome Linked List 
// https://www.codingninjas.com/codestudio/problems/palindrom-linked-list_799352

/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
    private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        while (curr != null) {
            LinkedListNode<Integer> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    private static LinkedListNode<Integer> mid(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        // Write your code here!
        if (head == null) {
            return true;
        }
        LinkedListNode<Integer> midd = mid(head);
        LinkedListNode<Integer> last = reverse(midd.next);
        LinkedListNode<Integer> curr = head;
        while (last != null) {
            if (!curr.data.equals(last.data)) {
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        return true;
    }
}