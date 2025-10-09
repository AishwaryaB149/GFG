/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    int maxTillNow=-1;
    boolean isBST(Node root) {
        // code here.
        if(root==null)
            return true;
        if(!isBST(root.left))
            return false;
        if(root.data<maxTillNow)
            return false;
        maxTillNow=root.data;
        return isBST(root.right);
    }
}