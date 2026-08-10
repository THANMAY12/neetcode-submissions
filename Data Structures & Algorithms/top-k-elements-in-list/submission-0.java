class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
    
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        Integer arr[]=mp.keySet().toArray(new Integer[0]);

        Arrays.sort(arr,(a,b)->mp.get(b)-mp.get(a));
        int an[]=new int[k];
        for(int i=0;i<k;i++){
            an[i]=arr[i];
        }
        return an;

    }
}
