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
    public TreeNode sortedArrayToBST(int[] num) {
        return convertToBST(num,0,num.length-1);
    }
    
    public TreeNode convertToBST(int[] num, int start, int end){
        if( start <= end){
            int mid = start + (end-start)/2;
            TreeNode node = new TreeNode(num[mid]);
            node.left = convertToBST(num,start,mid-1);
            node.right= convertToBST(num,mid+1,end);
            return node;
        }
        return null;
    }
}
