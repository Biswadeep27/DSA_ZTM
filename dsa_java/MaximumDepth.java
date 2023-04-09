
import java.util.*;

public class MaximumDepth {

    public static int answer;

    public static void maxDepthTD(TreeNode root,int depth){
        if (root == null){
            return;
        }
        if ( root.left == null && root.right == null){
            answer = Math.max(answer,depth);
        }

        maxDepthTD(root.left,depth + 1);
        maxDepthTD(root.right,depth + 1);
    }

    public static int maxDepthBU(TreeNode root){
        if (root == null){
            return 0;
        }
        int left_depth = maxDepthBU(root.left);
        int right_depth = maxDepthBU(root.right);
        return Math.max(left_depth,right_depth) + 1;
    }

    public static void main(String args[]){

        TreeNode binary_tree = new TreeNode(3);
        binary_tree.left = new TreeNode(2);
        binary_tree.right = new TreeNode(4);
        binary_tree.left.right = new TreeNode(1);
        binary_tree.left.right.left = new TreeNode(6);
        binary_tree.left.right.right = new TreeNode(7);
        binary_tree.left.right.right.left = new TreeNode(8);
        binary_tree.right.left = new TreeNode(3);
        binary_tree.right.left.left = new TreeNode(4);
        binary_tree.right.left.right = new TreeNode(5);

        System.out.println("The root node is : " + (binary_tree.val));

        int depth = 1;

        //maxDepthTD(binary_tree,depth);

        //max depth using bottom-up approach - recursive
        int answer_bu = maxDepthBU(binary_tree);

        System.out.println("The maximum depth is : " + (answer_bu));

    }

}
