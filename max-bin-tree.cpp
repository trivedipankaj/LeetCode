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
    
    int getMaxIndex(vector<int> a, int i, int j){
        int max = INT_MIN;
        int res;
        for(int k=i; k<=j;k++){
            if(max < a[k]) {
                max = a[k];
                res = k;
            }
            
        }
        return res;
    }
    
    TreeNode* buildMax(vector<int>& a, int start, int end){
          if(start <= end){
              int index = getMaxIndex(a,start, end);
              TreeNode *root = new TreeNode(a[index]);
              root->left = buildMax(a, start, index-1);
              root->right = buildMax(a, index+1, end);
           return root;   
          }
        return NULL;
    }
    
    TreeNode* constructMaximumBinaryTree(vector<int>& nums) {
           return buildMax(nums,0, nums.size()-1);
    }
};
