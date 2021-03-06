package tree;


import java.util.ArrayList;
import java.util.List;

public class LeetCode94_binary_tree_inorder_traversal {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        doTraversal(root,list);
        return list;
    }

    private void doTraversal(TreeNode root, List<Integer> list) {
        if(root == null){
            return ;
        }
        doTraversal(root.left,list);
        list.add(root.val);
        doTraversal(root.right,list);
    }

}

