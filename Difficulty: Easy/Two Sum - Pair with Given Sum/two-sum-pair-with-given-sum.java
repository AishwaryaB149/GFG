class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
        
        int low=i+1;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==complement){
                return true;
            }
            if(arr[mid]>complement){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        }
    return false;
}
}