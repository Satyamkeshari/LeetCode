
class Solution {
    public int left(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(left(root.left),left(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int diff =Math.abs( left(root.left) - left(root.right));
        if(diff>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
}