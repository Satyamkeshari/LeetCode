class Solution {
    public int findGCD(int[] nums) {
        int hcf =1;
       int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().orElseThrow();
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){
                hcf=i;

            }
        }
        return hcf;
 
    }
}