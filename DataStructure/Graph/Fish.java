package DataStructure.Graph;

import java.util.Scanner;

class Fish {
    public int findMaxFish(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxFish = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] > 0) {
                    maxFish = Math.max(maxFish, dfs(grid, r, c));
                }
            }
        }

        return maxFish;
    }

    private int dfs(int[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 0) {
            return 0;
        }

        int fish = grid[r][c];
        grid[r][c] = 0;

        fish += dfs(grid, r - 1, c); 
        fish += dfs(grid, r + 1, c); 
        fish += dfs(grid, r, c - 1); 
        fish += dfs(grid, r, c + 1); 

        return fish;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        Fish solution = new Fish();
        System.out.println(solution.findMaxFish(grid));
    }
}