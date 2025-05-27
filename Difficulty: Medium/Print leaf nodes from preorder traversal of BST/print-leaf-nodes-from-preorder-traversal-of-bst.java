class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder) {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> r=new ArrayList<>();
        for(int i=0,j=1;j<preorder.length;i++,j++){
            boolean f=false;
            if(preorder[i]>preorder[j]) st.push(preorder[i]);
            else{
                while(!st.isEmpty() && preorder[j]>st.peek()){
                    st.pop();
                    f=true;
                }
            }
            if(f) r.add(preorder[i]);
        }
        r.add(preorder[preorder.length-1]);
        return r;
    }
}