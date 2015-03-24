/***
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
**/


public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        List temp = new LinkedList<Integer>();
        if(numRows==0) return res;
        temp.add(1);
        res.add(temp); 
        if(numRows==1) return res;
        temp = new LinkedList<Integer>();
        temp.add(1); temp.add(1);
        res.add(temp);
        for(int i=3; i<=numRows;i++){
            temp = new LinkedList<Integer>();
            temp.add(1);
            for(int j=0; j<i-2;j++){
                int val = res.get(i-2).get(j) + res.get(i-2).get(j+1);
                temp.add(val);
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}
