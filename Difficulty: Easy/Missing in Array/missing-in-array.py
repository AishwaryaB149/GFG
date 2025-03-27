#User function Template for python3
class Solution:
    def missingNumber(self, arr):
        n=len(arr)+1;
        sum1=(n*(n+1))//2
        sum2=0
        for i in range(0,n-1):
            sum2+=arr[i]
        return sum1-sum2
            
#{ 
 # Driver Code Starts
#Initial Template for Python 3

t = int(input())
for _ in range(0, t):
    arr = list(map(int, input().split()))
    s = Solution().missingNumber(arr)
    print(s)

    print("~")
# } Driver Code Ends