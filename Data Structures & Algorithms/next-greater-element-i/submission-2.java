class Solution {
    static int check(int[] nums2,int n,int j){
        for(int i=j+1;i<nums2.length;i++){
            System.out.println(nums2[i]+" "+j+" "+n);
            if(nums2[i]>n) return nums2[i];
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) arr[i]=check(nums2,nums2[j],j);
            }
        }
        return arr;
    }
}