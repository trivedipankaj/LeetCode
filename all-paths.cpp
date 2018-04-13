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
    vector<string> v;
    void allPaths(TreeNode* root, vector<int> path){
        if(root !=NULL){
            path.push_back(root->val);
            if(root->left ==NULL && root->right ==NULL){
                    string s="";
                    for(int i=0; i<path.size(); i++){
                         if(i==0) s= ""+ to_string(path[i]);
                          else s += "->"+ to_string(path[i]);
                    }
                v.push_back(s);
            }
           allPaths(root->left, path);
           allPaths(root->right, path);
        }
    
    }
    
    
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<int> path;
        allPaths(root, path);
        return v;
    }
};
