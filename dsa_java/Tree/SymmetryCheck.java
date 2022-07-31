package Tree;


public class SymmetryCheck {

    public static boolean isSymmetric(TreeNode root){
        return isMirror(root,root);
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null){
            return false;
        }
        return ( t1.val == t2.val ) && isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
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

        System.out.println("The symmetry status of the binary tree: " + (isSymmetric(binary_tree)));
    }
}
