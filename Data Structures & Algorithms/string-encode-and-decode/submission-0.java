class Solution {

    public String encode(List<String> strs) {
        String ls="";
        for(String s:strs){
            ls=ls+"Thanmay"+s;

        }
        return ls;
    }

    public List<String> decode(String str) {
        List<String> ls=new ArrayList<>();
            String s[]=str.split("Thanmay",-1);
            for(int i=1;i<s.length;i++){
                
                ls.add(s[i]);
            }
            return ls;
    }
}
