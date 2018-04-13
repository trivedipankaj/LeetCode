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
    int ans,h;
    void dfs(TreeNode* root, int depth){
        if(root !=NULL){
            if(depth > h) { h=depth; ans = root->val;}
            dfs(root->left, depth+1);
            dfs(root->right, depth+1);   
        }
        
    }
    
    int findBottomLeftValue(TreeNode* root) {
        h=0;
        dfs(root, 1);
        return ans;
    }
};
