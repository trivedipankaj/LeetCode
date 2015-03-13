public class Solution {
   public List<TreeNode> generateTrees(int n) {
      return generateUniq(1,n);
   }
   
   public List<TreeNode> generateUniq(int low, int high){
       List<TreeNode> list = new ArrayList<TreeNode>();
       if(low>high){
           list.add(null);
           return list;
       }
       for(int i=low;i<=high;i++){
            
            List<TreeNode> left = generateUniq(low,i-1);
            List<TreeNode> right = generateUniq(i+1,high);
            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode node = new TreeNode(i);
                    node.left =l;
                    node.right =r;
                    list.add(node);
                }
             }    
           }
         return list;      
       }

   }
