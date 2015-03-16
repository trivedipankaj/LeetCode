public class MajorityElementSimple {
    public int majorityElement(int[] num) {
        int n= num.length;
        int res=0;
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0; i<num.length;i++){
            int val=1;
            if(m.containsKey(num[i])){
               val =1+m.get(num[i]);
            }
            m.put(num[i],val);
            if(val>n/2){
                res=num[i];
                break;
            }
        }
    return res;    
    }
}
