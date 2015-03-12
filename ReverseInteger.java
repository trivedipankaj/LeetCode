public class Solution {
    public int reverse(int x) {
        boolean flag=true;
        if(x<0){
            flag=false;
            x=-x;
        }
        int temp;
        long res=0;
        while(x>0){
            temp = x%10;
            res = res*10+temp;
            x=x/10;
        }
        
        if (res>=Integer.MAX_VALUE) return 0;
        if(flag==false){
            res =-res;
        }
       
        return (int)res;
    }
}
