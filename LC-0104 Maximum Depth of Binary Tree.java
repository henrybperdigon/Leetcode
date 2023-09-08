/**
Approach 1: Iterative
*/
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        
        while(!queue.isEmpty()) {
            int levelNum = queue.size();
            for (int i=0; i<levelNum; i++) {
               TreeNode node = queue.poll();

                if(node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }   
            }
            level++;
        }

        return level;
        
    }
}

/**
Approach 2: Recursion
*/
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
