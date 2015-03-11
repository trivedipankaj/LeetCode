public class Solution {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    Stack<List<Integer>> st = new Stack<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root !=null){
            Queue<TreeNode> q=new LinkedList<TreeNode>();
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
               st.push(tempList);
               tempList = new ArrayList<Integer>();
            }
            q.clear();
        }
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        return list;
        
    }
}
