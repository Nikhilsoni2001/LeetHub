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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        TreeInfo info = findDiameter(root);
        return info.diameter;
    }
    
    public TreeInfo findDiameter(TreeNode root) {
        if(root == null) return new TreeInfo(0, 0);
        
        TreeInfo left = findDiameter(root.left);
        TreeInfo right = findDiameter(root.right);
        
        int myHeight = Math.max(left.height, right.height) + 1;
        
        int dia1 = left.diameter;
        int dia2 = right.diameter;
        int dia3 = left.height + right.height;
        
        int myDia = Math.max(dia3, Math.max(dia1, dia2));
        
        return new TreeInfo(myHeight, myDia);
    }
    
    static class TreeInfo {
        int height;
        int diameter;
        
        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
}