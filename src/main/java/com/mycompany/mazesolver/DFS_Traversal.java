/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazesolver;

import java.util.List;

/**
 *
 * @author geetanjali
 */
public class DFS_Traversal {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static boolean searchPath(int[][] maze, int x, int y, List<Integer> path) {
        
        //Reached the destination
        if (maze[y][x] == 9) {
            path.add(x);
            path.add(y);
            return true;
        }

        //0 represents accessible block 
        if (maze[y][x] == 0) {
            
            //mark visited
            maze[y][x] = 2;

            for (int i = 0; i < 4; i++) {
                int nr = dx[i] + x;
                int nc = dy[i] + y;

                if (searchPath(maze, nr, nc, path)) {
                    path.add(x);
                    path.add(y);
                    return true;
                }
            }
        }

        //If cell has 1 (represents blocker)
        return false;
    }
}
