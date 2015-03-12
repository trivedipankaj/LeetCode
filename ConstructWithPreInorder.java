public class Solution {
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length==0) return null;
        return buildBTree(preorder,inorder,0,inorder.length-1);
    }
    
    public TreeNode buildBTree(int[] preorder, int[] inorder, int start, int end){
        
        if(start>end){ return null;}
        TreeNode node = new TreeNode(preorder[preIndex]);
        int inorderIndex = getInorderIndex(inorder,preorder[preIndex]);
        preIndex++;
        node.left = buildBTree(preorder,inorder,start,inorderIndex-1);
        node.right = buildBTree(preorder,inorder,inorderIndex+1,end);
        return node;
        
    }
    
    public int getInorderIndex(int[] inorder, int target){
        for(int i=0; i<inorder.length;i++){
            if(inorder[i]==target){
                return i;
            }
        }
        return -1;
    }
}
