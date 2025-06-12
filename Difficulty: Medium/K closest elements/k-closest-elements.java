class Solution {
    int[] printKClosest(int[] arr, int k, int x) {
        int n = arr.length, l = 0, h = n - 1, p = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] < x) { p = m; l = m + 1; }
            else h = m - 1;
        }
        int i = p, j = p + 1;
        if (j < n && arr[j] == x) j++;
        int[] r = new int[k]; int idx = 0;
        while (i >= 0 && j < n && idx < k)
            r[idx++] = Math.abs(arr[i] - x) < Math.abs(arr[j] - x) ? arr[i--] : arr[j++];
        while (i >= 0 && idx < k) r[idx++] = arr[i--];
        while (j < n && idx < k) r[idx++] = arr[j++];
        return r;
        
    }
}
