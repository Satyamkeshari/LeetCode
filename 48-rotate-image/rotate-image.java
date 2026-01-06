class Solution {
    public void rotate(int[][] arr) {
        
         for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]= temp;
				
			}
		}
		//  reverse the row
		
         for(int i=0;i<arr.length;i++){
            int top = 0;
            int bottom = arr.length - 1;
            while(top < bottom){
              int temp = arr[i][top];
              arr[i][top] = arr[i][bottom];
              arr[i][bottom] = temp;
               top++;
               bottom--;
            }
         }


    }
}