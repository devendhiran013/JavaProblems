package DataStructure.Graph;

import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length, cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int r, int c) {
        int rows = grid.length, cols = grid[0].length;
        
        // Check if out of bounds or if it's water ('0')
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == '0') {
            return;
        }

        // Mark as visited
        grid[r][c] = '0';

        // Visit all 4 directions
        dfs(grid, r + 1, c); // Down
        dfs(grid, r - 1, c); // Up
        dfs(grid, r, c + 1); // Right
        dfs(grid, r, c - 1); // Left
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input grid dimensions
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        char[][] grid = new char[m][n];

        System.out.println("Enter grid elements (1 for land, 0 for water):");
        for (int i = 0; i < m; i++) {
            String row = sc.next(); // Read each row as a string
            for (int j = 0; j < n; j++) {
                grid[i][j] = row.charAt(j); // Store each character in the grid
            }
        }

        Solution obj = new Solution();
        int result = obj.numIslands(grid);

        System.out.println("Number of islands: " + result);
        sc.close();
    }
}
