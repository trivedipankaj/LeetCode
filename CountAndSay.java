public class Solution {
    public String countAndSay(int n) {
        if(n==0) return "";
        if(n==1) return "1";
        int count=1;
        List<Integer> curr=new LinkedList<Integer>();
        curr.add(1);
        
        for(int i=2;i<=n;i++){
            List<Integer> newlist = new LinkedList<Integer>();
             count=1;
            for(int j=0; j<curr.size()-1;j++){
                if(curr.get(j) != curr.get(j+1)){
                    newlist.add(count);
                    newlist.add(curr.get(j));
                    count=1;
                }else{
                    count++;
                }
            }
            newlist.add(count);
            newlist.add(curr.get(curr.size()-1));
            curr =newlist;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < curr.size(); i++)
            sb.append(curr.get(i));
        return sb.toString();
    }
}
