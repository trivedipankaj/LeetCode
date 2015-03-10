/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
     List<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
         
        if(root !=null){
            Queue<TreeNode> q=new LinkedList<TreeNode>();
            TreeNode sen = new TreeNode(-10000);
            TreeNode temp;
            List<Integer> tempList = new ArrayList<Integer>();
            q.add(root);
            while(!q.isEmpty()){
               int len = q.size();
               for(int i=0; i<len;i++){
                   temp = q.poll();
                   tempList.add(temp.val);
                    if(temp.left !=null){
                     q.add(temp.left);
                    }
                    if(temp.right!=null){
                      q.add(temp.right);
                    }
               }
               list.add(tempList); 
               tempList = new ArrayList<Integer>();
            }
            q.clear();
        }
        return list;
    }
}
