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
//BFS
    vector<int> largestValues(TreeNode* root) {
        vector<int> v;
        queue<TreeNode*> q;
        if(root==NULL) return v;
        q.push(root);
        while(!q.empty()){
            int s = q.size();
            int m = INT_MIN;
            for(int i=0; i<s;i++){
                TreeNode* p = q.front();
                m = max(m,p->val);
                q.pop();
                if(p->left !=NULL) q.push(p->left);
                if(p->right!=NULL) q.push(p->right);
            }
            v.push_back(m);
        }
        return v;
    }
};
