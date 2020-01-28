package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class q3187 {
 
    static int R,C;
    static char[][]map;
    static boolean[][] visited;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int sheep;
    static int wolf;
    static Queue<Node> q = new LinkedList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        
        map = new char[R][C];
        visited = new boolean[R][C];
        
        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(map[i][j] == '#' || visited[i][j]) continue;
                solve(i,j);
            }
        }
        System.out.println(sheep+" "+wolf);
    }
    
    static void solve(int x, int y) {
        int v = 0;
        int k = 0;
        visited[x][y] = true;
        q.add(new Node(x, y));
        
        while(!q.isEmpty()) {
            
            Node cur = q.poll();
 
            if(map[cur.x][cur.y] == 'v') v++;
            if(map[cur.x][cur.y] == 'k') k++;
            
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                
                if(!isRange(nx, ny) || visited[nx][ny] || map[nx][ny] == '#')
                    continue;
                
                visited[nx][ny] = true;
                q.add(new Node(nx, ny));
            }
        }
        
        if(v >= k) {
            wolf += v;
        }
        else {
            sheep +=k;
        }
        
    }
    
    static boolean isRange( int x, int y) {
        if( x < 0 || x>= R || y <0 || y >=C) return false;
        return true;
    }
}
 
class Node {
    int x;
    int y;
    
    Node(int x,int y) {
        this.x = x;
        this.y = y;
    }
}