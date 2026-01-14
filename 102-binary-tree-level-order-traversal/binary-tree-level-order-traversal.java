
class Solution {
    public int find(TreeNode root){
        if(root==null) return 0;

        return 1+Math.max(find(root.left),find(root.right));
    }
    public void LevelOrder(ArrayList<Integer> arr, int idx,int n, TreeNode root){
        if(root==null) return ;
        if(idx==n) arr.add(root.val);
        LevelOrder(arr,idx+1,n,root.left);
        LevelOrder(arr,idx+1,n,root.right);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
         int level = find(root);
          for(int i=0;i<level;i++){
            ArrayList<Integer> arr = new ArrayList<>();

            LevelOrder(arr,0,i,root);
            ans.add(arr);
          }
         return ans;
        
    }
}