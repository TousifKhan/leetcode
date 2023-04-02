package org.techzoo.leetcode.easy;

import org.techzoo.leetcode.TreeNode;

public class Solution09 {

    //https://leetcode.com/problems/same-tree/description/

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (q == null && q == null) return true;
        if (q == null || q == null) return false;
        if (p.val == q.val)
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        return false;
    }

    public static void main(String[] args) {

    }
}
