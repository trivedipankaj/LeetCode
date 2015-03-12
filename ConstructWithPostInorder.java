public class Solution {
    int postIndex=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length==0) return null;
        postIndex = postorder.length-1;
        return buildBTree(inorder,postorder,0,postorder.length-1,0,postorder.length-1);
    }
    
    public TreeNode buildBTree(int[] inorder, int[] postorder, int start,int end, int pstart,int pend){
        if(start>end || pstart>pend) return null;
        TreeNode node = new TreeNode(postorder[pend]);
        int inorderIndex = getInorderIndex(inorder, postorder[pend]);
        node.left= buildBTree(inorder,postorder,start,inorderIndex-1,pstart,pstart+inorderIndex-(start+1));
        node.right = buildBTree(inorder,postorder,inorderIndex+1,end,pstart+inorderIndex-start,pend-1);
        return node;
    }
    
    public int getInorderIndex(int[] inorder, int target){
        for(int i=0; i< inorder.length; i++){
            if(inorder[i]==target){
                return i;
            }
        }
        return -1;
    }
}
