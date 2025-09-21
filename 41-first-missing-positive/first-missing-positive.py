class Solution(object):
    def firstMissingPositive(self, nums):
        n = len(nums)

        for i in range(n):
            # Swap nums[i] to its correct position while valid and not in correct place
            while 1 <= nums[i] <= n and nums[i] != nums[nums[i] - 1]:
                correct_index = nums[i] - 1
                nums[i], nums[correct_index] = nums[correct_index], nums[i]

        # After rearrangement, first place where number is not i+1 is the answer
        for i in range(n):
            if nums[i] != i + 1:
                return i + 1

        return n + 1
