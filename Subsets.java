/****
Given a set of distinct integers, S, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If S = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/


public class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    
    public List<List<Integer>> subsets(int[] S) {
        int[] A = new int[S.length];
        Arrays.sort(S);
        backTrack(A,0,S.length,S);
        return res;
    }
    
    public void processSolution(int[] A,int[] S){
        List temp = new ArrayList<Integer>();
        for(int i=0; i<S.length; i++){
            if(A[i]==1){
                temp.add(S[i]);
            }
        }
        res.add(temp);
    }
    
    public void backTrack(int[] A, int k, int n, int[] S){
        if(k==n){
            processSolution(A,S);
        }else{
            for(int i=0; i<=1; i++){
                A[k]=i;
                backTrack(A,k+1,n,S);
            }
        }
    }
}
