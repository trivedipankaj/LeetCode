/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    Queue<Integer> q = new LinkedList<Integer>();
    public BSTIterator(TreeNode root) {
        InorderTraversal(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !q.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        return q.poll();
    }
    
    public void InorderTraversal(TreeNode root){
        if(root!=null){
            InorderTraversal(root.left);
            q.add(root.val);
            InorderTraversal(root.right);
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
*/
