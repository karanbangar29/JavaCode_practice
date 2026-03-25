package com.coffeeshop.collections;

public class TwoDArrayEx {


        public static void main(String[] args) {

            int[][] grid = {
                    {1, 1, 1, 0},
                    {1, 1, 0, 0},
                    {0, 0, 1, 0},
                    {0, 0, 0, 1}
            };
            int[][] grid1 = {
                    {1, 1, 1, 1, 0},
                    {1, 1, 0, 1, 0},
                    {1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0}
            };


            int result = numIslands(grid1);
            int result1 = numIslands(grid);

            System.out.println("Number of Islands: " + result1);
            System.out.println("Number of Islands: " + result);
        }



        public static int numIslands(int[][] grid) {
            if (grid == null || grid.length == 0) return 0;

            int count = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        count++;
                        dfs(grid, i, j);
                    }
                }
            }
            return count;
        }
  //DFS defth first search recursion method
        private static void dfs(int[][] grid, int i, int j) {
            if (i < 0 || j < 0 ||
                    i >= grid.length ||
                    j >= grid[0].length ||
                    grid[i][j] == 0) {
                return;
            }

            grid[i][j] = 0; // mark visited

            dfs(grid, i + 1, j); // down
            dfs(grid, i - 1, j); // up
            dfs(grid, i, j + 1); // right
            dfs(grid, i, j - 1); // left
        }
    }


