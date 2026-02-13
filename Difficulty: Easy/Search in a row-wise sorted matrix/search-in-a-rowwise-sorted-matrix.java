

class Solution {
    // Function to search a given number in row-column sorted matrix.

    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            if(binarySearch(mat[i],x)==true){
                return true;
            }
            
        }
        return false;
    }
        public boolean binarySearch(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(x==arr[mid]){
                return true;
            }
            else if(x<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;;
            }
            
        }
        return false;
    }


}
