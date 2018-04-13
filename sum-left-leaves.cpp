/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
    int sum=0;
public:
    int sumOfLeftLeaves(TreeNode* root) {
        leftTree(root,false);
        return sum;
    }
    
    void leftTree(TreeNode* root, bool left){
        if(root !=NULL){
            if(root->left ==NULL && root->right == NULL && left){
                sum += root->val;
            }
           leftTree(root->left,true);
           leftTree(root->right,false);
            
        }
        
    }
};
