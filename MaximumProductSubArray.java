public class Solution {
    public int maxProduct(int[] A) {
        if(A.length==0) return 0;
        int max_so_far = A[0];
        int overall_max   = A[0];
        int min_so_far    = A[0];
        for(int i=1; i<A.length;i++){
           int tempMax = Math.max(max_so_far*A[i],Math.max(min_so_far*A[i],A[i]));
           int tempMin = Math.min(max_so_far*A[i],Math.min(min_so_far*A[i],A[i]));
           overall_max = Math.max(tempMax,overall_max);
           max_so_far =tempMax;
           min_so_far =tempMin;
        }
       
        return overall_max;
    }
}
