# @param {Character[][]} grid
# @return {Integer}
def num_islands(grid)
  return 0 if not grid
  ans = 0
  grid.length.times do |i|
    grid[0].length.times do |j|
      if grid[i][j] == '1'
        ans += 1
        extend(grid,i,j)
      end
    end
  end
  ans
end

def extend(grid,i,j)
  if i<grid.length and j <grid[0].length and i>=0 and j>=0 and grid[i][j] == '1'
    grid[i][j] = '0'
    extend(grid,i+1,j)
    extend(grid,i,j+1)
    extend(grid,i-1,j)
    extend(grid,i,j-1)
  end
end
