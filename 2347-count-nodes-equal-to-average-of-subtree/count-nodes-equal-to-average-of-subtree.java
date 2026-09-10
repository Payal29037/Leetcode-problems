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
    private int ans = 0;
    private long dfs(TreeNode node) {
        if(node == null){
            return 0L;
        }

        long left = dfs(node.left);
        long right = dfs(node.right);

        int sum = (int)(left >>> 32) + (int)(right >>> 32) + node.val;
        int count = (int)(left & 0xFFFFFFFFL) + (int)(right & 0xFFFFFFFFFL) + 1;

        if(node.val == (sum/count)){
            ans++;
        }

        return ((long)sum << 32) | ((long) count & 0xFFFFFFFFL);
    }

    public int averageOfSubtree(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }
}