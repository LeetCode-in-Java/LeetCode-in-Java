package g0901_1000.s0998_maximum_binary_tree_ii;

// #Medium #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        return insertIntoMaxTree2(root, val);
    }

    private TreeNode insertIntoMaxTree2(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            return new TreeNode(val, root, null);
        }
        root.right = this.insertIntoMaxTree2(root.right, val);
        return root;
    }
}