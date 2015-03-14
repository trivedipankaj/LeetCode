public class Solution {
	    List<List<Integer>> list = new ArrayList<List<Integer>>();
	    public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        getPathSum(root,sum,sum,new ArrayList<Integer>() );
	        return list;
	    }
	    
	    public void getPathSum(TreeNode root, int sum, int pathSum,List<Integer> path){
	        if(root ==null){
	            return;
	        }
	        path.add(root.val);
	        pathSum -=root.val;
	        if(root.left ==null && root.right==null && pathSum==0){
	            ArrayList<Integer> temp=new ArrayList<Integer> (path);
	            list.add(temp);
	        }
	        getPathSum(root.left,sum,pathSum,path);
	        getPathSum(root.right,sum,pathSum,path);
	        
	        path.remove(path.size()-1);
	    }
	}
}

