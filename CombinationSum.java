/******
Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3] 
*/

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
				list.add(candidates[i]);
				backTrack(result, list, candidates, target, i);
				list.remove(list.size() - 1);
			}
		}
	}
}
