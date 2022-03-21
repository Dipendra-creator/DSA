// LeetCode
// Binary Tree Level Order Traversal
// https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/931

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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, 1, res);
        return res;
       
    }
    
    public void dfs(TreeNode node, int level, List<List<Integer>> res) {
        if(node == null) {
            return;
        }
        
        if(res.size() < level) {
            res.add(new ArrayList<>());
        }
        List<Integer> levelElems = res.get(level - 1);
        System.out.println(levelElems);
        levelElems.add(node.val); 
        System.out.println(node.val);
        dfs(node.left, level + 1, res);
        dfs(node.right, level + 1, res);    
    }
}