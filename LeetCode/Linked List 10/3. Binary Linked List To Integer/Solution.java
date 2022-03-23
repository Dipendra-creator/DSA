// Codestudio Coding Ninjas
// problem: Binary Linked List To Integer
// https://www.codingninjas.com/codestudio/problems/binary-to-integer_2421938

/********************************************************

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

********************************************************/

import java.lang.*;

public class Solution {
	public static int binaryToInteger(int n, Node head) {
        // Write your code here.
        Node temp = head;
        int sum = 0;
        while(temp != null) {
            sum = sum * 2 + temp.data;
            temp = temp.next;
        }
        return sum;
    }
}