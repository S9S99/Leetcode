# 1528. Shuffle String
# https://leetcode.com/problems/shuffle-string/

# loop indice and insert new array->to string

# @param {String} s
# @param {Integer[]} indices
# @return {String}
def restore_string(s, indices)
    result_arr = Array.new(s.length)
    indices.each_with_index do |postion, idx|
        result_arr[postion] = s[idx]
    end
    result_arr.join
end
