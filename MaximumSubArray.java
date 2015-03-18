public class Solution {
    public int maxSubArray(int[] A) {
        if(A.length==0) return 0;
        int currMax =A[0];
        int maxSoFar= A[0];
        for(int i=1; i<A.length;i++){
            currMax = Math.max(currMax+A[i],A[i]);
            maxSoFar =Math.max(maxSoFar,currMax);
        }
        return maxSoFar;
    }
}
