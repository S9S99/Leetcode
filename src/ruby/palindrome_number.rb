# @param {Integer} x
# @return {Boolean}
def is_palindrome(x)
  if x < 0 || (x % 10 == 0 && x != 0)
    return false
  end
  revert = 0
  while x > revert
    revert = revert * 10 + x % 10
    x = x / 10
  end
  return x == revert || x == revert / 10
end
