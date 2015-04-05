/*******
Given a collection of integers that might contain duplicates, S, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If S = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
**/



public class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> subsetsWithDup(int[] S) {
         Arrays.sort(S);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        backTrack(res,list,S,0);
        return res;  
    }
    
     public void backTrack(List<List<Integer>> res, 
    		List<Integer> list,int[] S, int position){
       	res.add(new ArrayList<Integer>(list));
    		 	
    	for(int i=position; i<S.length;i++){
    		if(position!=i && S[i] == S[i-1]){
    			continue;
    		}
    		list.add(S[i]);
    		backTrack(res, list,S,i+1);
    		list.remove(list.size()-1);
    	}
    }
    
}
