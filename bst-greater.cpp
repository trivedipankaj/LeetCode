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
    int sum=0;
    void greaterTree(TreeNode* root){
        if(root !=NULL){          
            greaterTree(root->right);
            sum += root->val;
            root->val = sum;
            greaterTree(root->left); 
        }
    }
    
    TreeNode* convertBST(TreeNode* root) {
        sum =0;
        greaterTree(root);
        return root;
    }
};
