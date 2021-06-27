# 3. Longest Substring Without Repeating Characters
# https://leetcode.com/problems/longest-substring-without-repeating-characters/

# present index: idx
# beging of index without repeating: left_idx
# get length with left_idx~idx

# @param {String} s
# @return {Integer}
def length_of_longest_substring(s)
    dic = {}
    max = 0
    len = 0
    left_idx = 0

    s.each_char.with_index(1) do |char, i|
        idx = dic[char]
        if idx && idx >= left_idx
            left_idx = dic[char] + 1
            len = i - left_idx
        end

        dic[char] = i
        len += 1
        max = len if max < len
    end

    max
end
