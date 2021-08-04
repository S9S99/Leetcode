# @param {String} s
# @return {Integer}
def length_of_longest_substring(s)
    map = {}
    i = 0
    result = 0
    count = 0
    str_chars = s.chars
    while i < str_chars.length do
        if map[str_chars[i]] == nil then
            map[str_chars[i]] = 1
            count += 1
            if count > result then
                result = count
            end
        else
            if count > result then
                result = count
            end
            count = 1
            map = {}
        end
        
        i += 1
    end
    if result == 0 then
        result = str_chars.length
    end
    return result
end
