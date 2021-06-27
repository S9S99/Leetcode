# 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
# https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
# Answer is biggest numbun in string always
# so select string->array->max->to integer

# @param {String} n
# @return {Integer}
def min_partitions(n)
    n.split("").max.to_i
end
