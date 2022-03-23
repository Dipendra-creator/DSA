// Codestudio Coding Ninjas
// problem: Middle Of Linked List 
// https://www.codingninjas.com/codestudio/problems/middle-of-linked-list_973250

/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head, sol = head;
        int count = 1;
        while(curr.next != null){
        	curr = curr.next;
            count++;
        }
        int mid = count/2;
        while(mid != 0) {
            sol = sol.next;
            mid--;
        }
        return sol;
    }
}
