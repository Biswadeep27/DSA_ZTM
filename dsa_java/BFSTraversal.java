
import java.util.*;



public class BFSTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root ){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root != null){
            q.offer(root);
        }
        TreeNode curr;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> subAns = new LinkedList<Integer>();
            for (int i=0; i<size; ++i){
                curr = q.poll();
                subAns.add(curr.val);
                if (curr.left != null){
                    q.offer(curr.left);
                }
                if (curr.right != null){
                    q.offer(curr.right);
                }

            }
            ans.add(subAns);
        }

        return ans;
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



        /*int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i],10);
        }*/

        List<List<Integer>> res ;

        res = levelOrder(binary_tree);

        for (int i=0; i<res.size(); i++){
            for (int j=0; j<res.get(i).size(); j++){
                System.out.print((res.get(i).get(j)) + " ");
            }
            System.out.println();
        }


    }
}
