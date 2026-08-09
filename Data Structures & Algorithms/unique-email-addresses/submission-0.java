class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> st=new HashSet<String>();
        for(int i=0;i<emails.length;i++){
            String s="@";
            String back[]=emails[i].split("@");
            s=s+back[back.length-1];
            String fro="";
            System.out.println(s);
            for(int j=0;j<emails[i].length()-back[back.length-1].length()-1;j++){
                if(emails[i].charAt(j)!='.'&& emails[i].charAt(j)!='+'){
                    fro+=emails[i].charAt(j);
                }
                
                else if(emails[i].charAt(j)=='+') break;
                else if(emails[i].charAt(j)=='.') continue;
            }
            st.add(fro+s);
            s="";
            fro="";
        }
        for(String a:st){
            System.out.println(a);
        }
        return st.size();
    }
}