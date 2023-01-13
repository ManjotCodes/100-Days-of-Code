public class Solution {

    //InOrder Traversal
    public void inOrderTraversal(TreeNode Root){
        if(Root == null){
            return;
        }
        inOrderTraversal(Root.Left);
        System.out.println(Root.data);
        inOrderTraversal(Root.Right);
    }
    //PreOrder Traversal
    public void preOrderTraversal(TreeNode Root){
        if(Root == null){
            return;
        }
        System.out.println(Root.data);
        preOrderTraversal(Root.Left);
        preOrderTraversal(Root.Right);
    }
    //PostOrder Traversal
    public void postOrderTraversal(TreeNode Root){
        if(Root == null){
            return;
        }
        postOrderTraversal(Root.Left);
        postOrderTraversal(Root.Right);
        System.out.println(Root.data);
    }
