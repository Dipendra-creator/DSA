// LeetCode
// Binary Tree Preorder Traversal
// https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/928

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        
        printPreorder(root, l);
        
        return l;
    }
    
    // Node in Pre Order Of Given Binary Tree
    void printPreorder(TreeNode treeNode, List<Integer> l){
            
        if (treeNode != null){

            /* first Add data of node to List<Integer> */
            l.add(treeNode.val);

            /* then recur on left subtree */
            printPreorder(treeNode.left, l);

            /* now recur on right subtree */
            printPreorder(treeNode.right, l);

        }
    }
}