class Solution {
    public int hcf(int n, int m){
        if(n==0) return m;
        return hcf(m%n,n);
    }
    public int findGCD(int[] nums) {
        int hcf =1;
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().orElseThrow();
        return hcf(min, max);
      
        
 
    }
}