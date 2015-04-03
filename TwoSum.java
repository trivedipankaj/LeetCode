/***
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

*/


public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        int n = numbers.length;
        int l=0,k=0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            map.put(numbers[i],i);    
        } 
        
        for(int i=0; i<n;i++){
            if(map.containsKey(target-numbers[i])){
                int val = map.get(target-numbers[i]);
                l=val; k=i;
                if(l!=k){
                    res[0] = l<=k?l+1:k+1;
                    res[1] = l>k?l+1:k+1;
                    return res;
                }else{
                    continue;
                }
            }  
        }
    
        return res;
    }
}
