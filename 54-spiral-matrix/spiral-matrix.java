class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
         ArrayList<Integer> ans= new ArrayList<>();
        int n = arr.length; int m = arr[0].length;
		int fr=0 ; int lr = n-1;
		int fc= 0; int lc = m-1;
		while(fr<=lr && fc<=lc) {
			// left to right
			for(int i=fc;i<=lc;i++) {
				ans.add(arr[fr][i]);
			}
			fr++;
			if(fr>lr || fc>lc) break;
			
			// top to down 
			for(int j=fr;j<=lr;j++) {
				ans.add(arr[j][lc]);
			}
			lc--;
			if(fr>lr || fc>lc) break;
			// right to left
			for(int i=lc;i>=fc;i--) {
				ans.add(arr[lr][i]);
			}
			lr--;
			if(fr>lr || fc>lc) break;
			// donw to up
			for(int j=lr;j>=fr;j--) {
				ans.add(arr[j][fc]);
			}
			fc++;
			
			
		}
		return ans;
        
    }
}