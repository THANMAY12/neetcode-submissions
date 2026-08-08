class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int max=0;
        for(int i: nums){
            if(i==0){
                //max=Math.max(max,sum);
                if(max<sum) max=sum;
                sum=0;
            }
            else{
                sum++;
            }
        }

        return Math.max(max,sum);
    }
}