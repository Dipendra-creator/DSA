// Codestudio Coding Ninjas
// problem: Intersection of Linked List 
// https://www.codingninjas.com/codestudio/problems/intersection-of-linked-list_630457

/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Solution {
    class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}
	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
        LinkedListNode<Integer> fh = firstHead;
        LinkedListNode<Integer> sh = secondHead;
        
        while(fh!=sh) {
            if(fh==null) fh=secondHead;
            else fh=fh.next;
            
            if(sh==null) sh=firstHead;
            else sh=sh.next;
        }
        if (fh!=null) return fh.data;
        else return -1;
	}
}