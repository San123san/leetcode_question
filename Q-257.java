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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> rtl = new ArrayList<>();
        if(root!=null){
            traverse(root,"",rtl);
        }
        return rtl;
    }
    private void traverse(TreeNode node,String currPath,List<String> rtl){
        if(node.left==null && node.right==null) {rtl.add(currPath+node.val);}
        if(node.left!=null){traverse(node.left,currPath+node.val+"->",rtl);}
        if(node.right!=null){traverse(node.right,currPath+node.val+"->",rtl);}
    }
}