package com.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Leetcode94 {

    /**
     *Definition for a binary tree node.
     **/
    //树的定义
      public class TreeNode {
          int val;
          TreeNode left;
         TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public List<Integer> inorderTraversal(TreeNode root) {

          if(root==null){
              return  new ArrayList<>();
          }
          List<Integer> list = new ArrayList<>();
          list.addAll(inorderTraversal(root.left));
          list.add(root.val);
          list.addAll(inorderTraversal(root.right));
          return  list;
    }

}
