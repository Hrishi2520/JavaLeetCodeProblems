import java.util.List;
import java.util.ArrayList;
import TreeNode.java;
// Definition for a binary tree node.
// public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }
public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null) return result;

        String current_path = Integer.toString(root.val);
        if(root.left == null && root.right == null) result.add(current_path);
        if(root.left != null) dfs(root.left, current_path, result);
        if(root.right != null) dfs(root.right, current_path, result);        
        return result;
    }
    public static void dfs(TreeNode root,String current_path, List<String> result) {
        current_path += "->"+root.val;

        if(root.left == null && root.right == null) {
            result.add(current_path);
            return;
        } 
        if(root.left != null) dfs(root.left, current_path, result);
        if(root.right != null) dfs(root.right, current_path, result);
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();

        TreeNode root = {1,2,3,null,5};

        result = binaryTreePaths(root);

        System.out.println(result.toString);
    } 
}