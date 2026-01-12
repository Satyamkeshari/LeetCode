
class Solution {
    public boolean isSymmetric(TreeNode root) {
        mirror(root.left);
        return isident(root.left,root.right);
    }

    public boolean isident(TreeNode p ,TreeNode q){
        if(p==null&& q==null) return true;
        else if(p==null || q==null) return false;
        else  if(p.val!=q.val) return false;
        return isident(p.left,q.left) && isident(p.right,q.right);

    }

     void mirror(TreeNode root){
        if(root==null) return ;
        TreeNode temp = root.left;
        root.left= root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
}