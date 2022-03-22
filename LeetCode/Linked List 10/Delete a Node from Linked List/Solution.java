/****************************************************************

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        // Write your code here.
        if (head == null)
            return head;
        LinkedListNode<Integer> temp = head;
        if (pos == 0) {
            head = temp.next;
            return head;
        }
        int i = 0;
        while (temp.next != null && i < pos - 1) {
            temp = temp.next;
            i++;
        }
        if (temp.next == null)
            return head;
        temp.next = temp.next.next;
        return head;
        
    }
}
