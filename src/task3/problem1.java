package task3;

import java.awt.*;
import java.util.Set;

public class problem1 {
    public static boolean computePath(int m, int n, boolean[][] maze, Set<Point> path) {
        if (m < 0 || n < 0) {
            return false;
        }
        if (maze[m][n]) {
            return false;
        }
        if (((m == 0) && (n == 0)) || computePath(m, n - 1, maze, path)|| computePath(m - 1, n, maze, path)) {
            path.add(new Point(m, n));
            return true;
        }
        return false;
    }

    public static boolean[][] createMaze(){
        boolean [][] maze = new boolean[3][3];
        maze[0][0] = true;
        maze[0][1] = false;
        maze[0][2] = true;
        maze[1][0] = true;
        maze[2][0] = false;
        maze[1][1] = true;
        maze[1][2] = false;
        maze[2][1] = true;
        maze[2][2] = true;
        return maze;
    }
}
