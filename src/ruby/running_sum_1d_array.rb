# 1480. Running Sum of 1d Array
# https://leetcode.com/problems/running-sum-of-1d-array/

# @param {Integer[]} nums
# @return {Integer[]}
def running_sum(nums)
  result = []
  
  nums.each_with_index do |num, idx|
    result.push(nums[0..idx].sum)
  end

  result
end
