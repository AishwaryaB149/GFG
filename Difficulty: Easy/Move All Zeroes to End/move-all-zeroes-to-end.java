class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=0;
        }
    }
}