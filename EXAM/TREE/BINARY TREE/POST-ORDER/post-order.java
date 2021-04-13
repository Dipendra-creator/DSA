// LeetCode
// Binary Tree Postorder Traversal
// https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/930/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        
        printPostorder(root, l);
        
        return l;
    }
    
    // Node in Post Order Of Given Binary Tree
    void printPostorder(TreeNode treeNode, List<Integer> l){
            
        if (treeNode != null){
            /* then recur on left subtree */
            printPostorder(treeNode.left, l);

            /* now recur on right subtree */
            printPostorder(treeNode.right, l);
            
            /* first Add data of node to List<Integer> */
            l.add(treeNode.val);
        }
    }
}