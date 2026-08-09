class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs=new HashSet<String>();

        for(int i=0;i<emails.length;i++){
            String arr[]=emails[i].split("@");
            String local=arr[0].split("\\+")[0];

            String domain="@"+arr[arr.length-1];
            local=local.replace(".","");
            hs.add(local+domain);
        }
        return hs.size();
        
    }
}