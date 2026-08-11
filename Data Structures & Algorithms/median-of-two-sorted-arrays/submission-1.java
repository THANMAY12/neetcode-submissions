class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n+m];
    int i=0,j=0;
        while(i!=n&&j!=m){

            if(nums1[i]<=nums2[j]){
                arr[i+j]=nums1[i];
                i++;
            }
            else {
                arr[i+j]=nums2[j];
                j++;
            }
        }
        while(i<n&& j==m){
            arr[i+j]=nums1[i];
            i++;
        }
        while(i==n&& j<m){
            arr[i+j]=nums2[j];
            j++;
        }
        if((n+m)%2==0){
            return (arr[(n+m)/2]+arr[(n+m)/2-1])/2.0;
        }
        else return arr[(n+m)/2];
    }
}