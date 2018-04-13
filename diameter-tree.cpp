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
    int height(TreeNode* root){
        if(root ==NULL) return 0;
        return 1+max(height(root->left) , height(root->right));
    }
    
    int diameterOfBinaryTree(TreeNode* root) {
        if(root !=NULL){
            int lh = height(root->left);
            int rh = height(root->right);
            return max( lh+rh, 
                       max( diameterOfBinaryTree(root->left), 
                           diameterOfBinaryTree(root->right)
                          )
                    );
            
        }
        return 0;
    }
};
