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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode head = root;
        while(true) {
            if(head.val < val) {
                if(head.right == null) {
                    head.right = new TreeNode(val);
                    return root;
                }
                head = head.right;
            } else {
                if(head.left == null) {
                    head.left = new TreeNode(val);
                    return root;
                }
                head = head.left;
            }
        }
    }
}