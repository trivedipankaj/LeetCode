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
    string tree2str(TreeNode* t) {
        if(t==NULL){
            return "";
        }
        string l,r,b;
        l = t->left !=NULL ? "(" + tree2str(t->left) + ")" : "";
        b = t->left == NULL && t->right !=NULL ? "()" : "";
        r = t->right !=NULL ?  "(" + tree2str(t->right) + ")" : "";
        
        return to_string(t->val) + l+b+r;
    }
};
