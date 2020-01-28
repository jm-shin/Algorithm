package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class q10026 {
    
    static char map[][];
    static boolean visited[][];
    static int n;
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};
    
    static int count = 0;
    static int count2 = 0;
    
    public static void dfs(int x, int y){
        visited[x][y] = true;
        
        char c = map[x][y];
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx>=0 && nx < n && ny>=0 && ny<n && !visited[nx][ny]){
                if(map[nx][ny] == c){
                    dfs(nx,ny);
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        map = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = str[j].charAt(0);
            }
        }
        
        visited = new boolean[n][n];
        
        //정상
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(visited[i][j] == false){
                    count++;
                    dfs(i,j);
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] == 'G')
                    map[i][j] = 'R';
            }
        }
        
        visited = new boolean[n][n];
        
        //적록 색약
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(visited[i][j] == false){
                    count2++;
                    dfs(i,j);
                }
            }
        }
        
        System.out.println(count + " " + count2);
    }
}
