package Tree;



public class BinarySearchTree {

    public boolean search(TreeNode root, int value){
        if (root == null){
            return false;
        }

        if (root.val == value){
            return true;
        }
        else{
            if (value < root.val){
                return search(root.left, value);
            }
            else{
                return search(root.right, value);
            }
        }
    }

    public TreeNode insert(TreeNode root, int value){
        if(root == null){
             //root.val = value;
             //return root;
            TreeNode node = new TreeNode(value);
            return node;
        }
        TreeNode node = root;

        if (value < node.val){

        }
        return node;
    }
}
