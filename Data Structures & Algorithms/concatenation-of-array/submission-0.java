class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int[] ans=new int[n];
        int i=0;
        for(i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        
        for(int j=0;j<nums.length;j++){
            ans[i]=nums[j];
            i++;
        }
        return ans;
    }
}