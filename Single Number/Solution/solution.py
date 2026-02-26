class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        numbers = []
        for num in nums:
            if num in numbers:
                numbers.remove(num)
            else:
                numbers.append(num)
        return numbers[0]
