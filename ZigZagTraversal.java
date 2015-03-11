public class Solution {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         if(root !=null){
            Queue<TreeNode> q=new LinkedList<TreeNode>();
            boolean flag = true;
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
               if(!flag){
                   Collections.reverse(tempList);
               }
               list.add(tempList); 
               tempList = new ArrayList<Integer>();
               flag =!flag;
            }
            q.clear();
        }
        return list;
    }
}
