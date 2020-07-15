/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
 class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root == null) 
            return new ArrayList<List<Integer>>(); 
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> l=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                l.add(temp.val);
             if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            }
            res.add(l);
             
           
        }Collections.reverse(res);
        return res; 
        } 
        
        
       
    }
