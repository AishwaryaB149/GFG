/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}  */
class Solution {
    static int ans;
    public static int minTime(Node root, int target) {
        ans=0;
        dfs(root,target);
        return ans;
        
    }
    static int[] dfs(Node r,int target){
        if(r==null) return new int[]{0,-1};
        int[] l=dfs(r.left,target),ri=dfs(r.right,target);
        int h=Math.max(l[0],ri[0])+1,d=-1;
        if(r.data==target){d=0;ans=Math.max(ans,h-1); }
        else if(l[1]>=0){d=l[1]+1; ans=Math.max(ans,ri[0]+d); }
        else if(ri[1]>=0){d=ri[1]+1; ans=Math.max(ans,l[0]+d); }
        return new int[]{h,d};
    }
}