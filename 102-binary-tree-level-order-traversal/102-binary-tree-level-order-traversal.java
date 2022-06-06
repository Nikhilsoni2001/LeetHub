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
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> levelOrderNodes = new ArrayList<>();
        if(root != null)
            q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> currLevelNodes=new ArrayList();
            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                currLevelNodes.add(node.val);
            }
            levelOrderNodes.add(currLevelNodes);
        }
        return levelOrderNodes;
    }
}