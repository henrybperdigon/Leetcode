class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if (root == null) return false;
      if (subRoot == null) return true;

      if (isSameTree(root, subRoot)) return true;

      return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
       if (p == null || q == null) return p == q;

       return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right) 
    } 
}
