class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int[] pref=new int[n];
        int[] suff=new int[n];
        pref[0]=arr[0];
        suff[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]+arr[i];
        }
        for(int i=0;i<n-1;i++){
            if(pref[i]==suff[i]){
                return i;
            }
        }
        return -1;
    }
}
