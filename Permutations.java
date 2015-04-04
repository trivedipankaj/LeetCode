/********
Given a collection of numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
*/



public class Solution {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list= new ArrayList<Integer>();
        backTrack(res,list,num);
        return res;
    }
    
    public void backTrack(List<List<Integer>> res, List<Integer> list, int[] num){
        if(num.length == list.size()){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=0; i<num.length; i++){
            if(list.contains(num[i])){
                continue;
            }
            
            list.add(num[i]);
            backTrack(res,list,num);
            list.remove(list.size()-1);
        }
        
    }
    
}
