class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        n = len(nums)
        summ = sum(nums[0:k])
        maxa = summ/k
        for i in range(1 , (n-k)+1):
            summ -= nums[i-1]
            summ += nums[i+k-1]
            maxa = max(maxa , summ/k)
        return maxa