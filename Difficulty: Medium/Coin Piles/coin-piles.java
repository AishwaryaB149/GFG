class Solution {
    public int minimumCoins(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length, t = Arrays.stream(arr).sum(), res = t, w = 0, p = 0, e = 0;
        for (int s = 0; s < n; s++) {
            while (e < n && arr[e] - arr[s] <= k) w += arr[e++];
            int r = Math.max(0, (t - p - w) - (n - e) * (arr[s] + k));
            res = Math.min(res, p + r);
            if (e == s) e++; else w -= arr[s];
            p += arr[s];
        }
        return res;
        
    }
}
