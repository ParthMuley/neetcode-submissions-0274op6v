class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        Set=set()
        for i in nums:
            Set.add(i)
        if len(Set)!=len(nums):
            return True
        return False

        