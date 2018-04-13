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
    int second;
    int smallest;
    void dfs(TreeNode* root){
            if(root !=NULL){
                if(root->val != smallest && root->val < second){
                    second = root->val;
                }        
               dfs(root->left);
               dfs(root->right);
            }
        
    }
    
    int findSecondMinimumValue(TreeNode* root) {
        smallest = root->val;
        second = INT_MAX;
        dfs(root);
        if(second ==INT_MAX) second=-1;
        return second;
    }
};
