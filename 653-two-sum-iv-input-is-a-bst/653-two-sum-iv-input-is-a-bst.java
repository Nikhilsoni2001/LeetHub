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
    HashSet<Integer> set;
    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet<>();
        return check(root, k);
    }
    
    private boolean check(TreeNode root, int k) {
        if(root == null) return false;
        if(set.contains(k - root.val)) return true;
        else set.add(root.val);
        return check(root.left, k) || check(root.right, k);
    }
}