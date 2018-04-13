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
    vector<double> averageOfLevels(TreeNode* root) {
        vector<double> v;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            int s= q.size();
            long sum=0;
            for(int i=0; i<s; i++){
                TreeNode *p = q.front();
                sum += p->val;
                q.pop();
                if(p->left !=NULL)
                     q.push(p->left);
                if(p->right !=NULL)
                    q.push(p->right);
            }
            v.push_back(sum*1.0/s);
        }
        return v;
    }
};
