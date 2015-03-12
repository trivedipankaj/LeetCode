public class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        InOrder(root);
        int count=0;
        Integer prev=0;
        if(list.size()==1) return true;
        for(Integer item:list){
            if(count!=0){
            if(item<=prev) return false;
             prev=item;
             count++;   
            }else{
                prev=item; count++;
            }
        }
        return true;
    }
    public void InOrder(TreeNode root){
        if(root !=null){
            InOrder(root.left);
            list.add(root.val);
            InOrder(root.right);
        }
    }
}
