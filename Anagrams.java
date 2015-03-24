/***

Given an array of strings, return all groups of strings that are anagrams.

Note: All inputs will be in lower-case.
**/


public class Solution {
    public List<String> anagrams(String[] strs) {
        List<String> res = new ArrayList<String>();
        
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for(String str:strs){
            char[] tempStr = str.toCharArray();
            Arrays.sort(tempStr);
            String sorted = new String(tempStr);
            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }else{
                List<String> tempList = new ArrayList<String>();
                tempList.add(str);
                map.put(sorted,tempList);
            }
        }
        for(List<String> list:map.values())
            if(list.size()>1)
                for(String str : list)
                    res.add(str);
        return res;            
    }
}
