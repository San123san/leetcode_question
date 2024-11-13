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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> store = new ArrayList<>();
        if(root == null) return store;
        
        return zigzagDFS(root, 0, store, true);
    }

    public List<List<Integer>> zigzagDFS(TreeNode node, int level, List<List<Integer>> store, boolean leftToRight) {
        if (node == null) return store;

        if (store.size() <= level) {
            store.add(new ArrayList<>());  
        }

        if (leftToRight) {
            store.get(level).add(node.val); 
        } else {
            store.get(level).add(0, node.val);  
        }

        zigzagDFS(node.left, level + 1, store, !leftToRight);  
        zigzagDFS(node.right, level + 1, store, !leftToRight); 

        return store;  
    }
}
