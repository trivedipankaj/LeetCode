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
    map<int,int> m;
    int sum, val;
    int treeSum(TreeNode* root){
        if(root ==NULL) return 0;
           sum =  root->val + treeSum(root->left) + treeSum(root->right);   
        if(!m.count(sum)) m.insert(pair<int,int>(sum,1));
        else {
             val = m[sum]+1;
             m.at(sum) = val;
        }
        return sum; 
    }
    vector<int> findFrequentTreeSum(TreeNode* root) {
        treeSum(root);
        vector<int> v;
        int ma=0;
        for (auto it=m.begin(); it!=m.end(); ++it){
            ma = max(ma, it->second);
        }
        for (auto it=m.begin(); it!=m.end(); ++it){
            if(it->second == ma){
                v.push_back(it->first);
            }
        }
        return v;
    }
};
