//Create a new Node
    public TreeNode CreateNode(int nodeValue){
        TreeNode node = new TreeNode();
        node.data = nodeValue;
        node.Left = null;
        node.Right = null;
        return node;
    }
    //Insert on left
    public TreeNode leftInsert(TreeNode Root,int nodeValue){
        Root.Left = CreateNode(nodeValue);
        return Root.Left;
    }
    //Insert on Right
    public TreeNode RightInsert(TreeNode Root,int nodeValue){
        Root.Right = CreateNode(nodeValue);
        return Root.Right;
    }

    public static class TreeTest {

        public static void main(String[] args) {

            Solution T1 = new Solution();
            TreeNode node = T1.CreateNode(10);
            T1.leftInsert(node,7);
            T1.RightInsert(node,17);
            T1.leftInsert(node.Left,8);
            T1.RightInsert(node.Left,9);
            T1.leftInsert(node.Right,15);
            T1.RightInsert(node.Right,12);

            T1.inOrderTraversal(node);
            System.out.println();
            T1.preOrderTraversal(node);
            System.out.println();
            T1.postOrderTraversal(node);

        }

    }
}
