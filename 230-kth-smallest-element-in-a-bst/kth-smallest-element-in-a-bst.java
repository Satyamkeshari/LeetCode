
class Solution {
    public void find( TreeNode root,ArrayList<Integer>arr){
        if(root==null) return ;
        find(root.left,arr);
        arr.add(root.val);
        find(root.right,arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        find(root,ans);
        return ans.get(k-1);
        
    }
}