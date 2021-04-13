// LeetCode
// Binary Tree Inorder Traversal
// https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/929/

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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> l = new ArrayList<>();
        
        printInorder(root, l);
        
        return l;
    }
    
    // Node in Pre Order Of Given Binary Tree
    void printInorder(TreeNode treeNode, List<Integer> l){
            
        if (treeNode != null){

            /* then recur on left subtree */
            printInorder(treeNode.left, l);
            
            /* first Add data of node to List<Integer> */
            l.add(treeNode.val);

            /* now recur on right subtree */
            printInorder(treeNode.right, l);

        }
    }
}