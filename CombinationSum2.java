/****
Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
A solution set is: 
[1, 7] 
[1, 2, 5] 
[2, 6] 
[1, 1, 6] 
*/


public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();

		backTrack(result, list, candidates, target, 0);

		return result;
    }
    
     private void backTrack(List<List<Integer>> result, 
			List<Integer> list, int[] candidates, int target, int position) {

		int sum = 0;
		for (int x: list) {
			sum += x;
		}

		if (sum == target) {
			result.add(new ArrayList<Integer>(list));
			return;
		}

		if (sum < target) {
			for (int i = position; i < candidates.length; i++) {
			    if((position!=i && candidates[i] == candidates[i-1])){
			        continue;
			    }
				list.add(candidates[i]);
				backTrack(result, list, candidates, target, i+1);
				list.remove(list.size() - 1);
			}
		}
	}
}
