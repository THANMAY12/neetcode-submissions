class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int num2[]=new int[2*n];
        for(int i=0;i<n;i++){
            num2[i]=nums[i%n];
            num2[n+i]=nums[i%n];
        }
        return num2;
    }
}