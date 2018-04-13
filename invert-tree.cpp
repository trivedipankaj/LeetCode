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
public:
    
    void invert(TreeNode* root){
        if(root !=NULL){
            invert(root->left);
            invert(root->right);
            TreeNode *temp = root->left;
            root->left = root->right;
            root->right = temp;
            
        }
    }
    
    
    TreeNode* invertTree(TreeNode* root) {
        invert(root);
        return root;
    }
};
