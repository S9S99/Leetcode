# @param {Integer} x
# @return {Integer}
def reverse(x)
    string_arr = x.to_s.split("").reverse
    if string_arr[-1] == "-" then
        string_arr.pop
        string_arr.unshift("-")
    end
        
    answer = string_arr.join("").to_i
    
    if answer >= 2147483647 || answer <= -2147483647 then
        return 0
    end
    
    return answer
end
