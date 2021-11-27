package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class S53 {
	public static void main(String[] args) {
		int rows = 3;
		int columns = 3;
		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		
		System.out.println(solution(rows, columns, queries));
		
	}
	
	public static int[] solution(int rows, int columns, int[][] queries) {
        
		int[][] origin = new int[rows+1][columns+1];
		
		for(int i=1;i<origin.length;i++) {
			for(int j=1;j<origin[i].length;j++) {
				origin[i][j] = ((i-1) * columns + j);
				System.out.println(origin[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(origin));
		
		int x1 = 0;
		int x2 = 0; 
		int y1 = 0;
		int y2 = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<queries.length;i++) {
			queries[i][0] = x1;
			queries[i][1] = x2;
			queries[i][2] = y1;
			queries[i][3] = y2;
			
			int start = origin[x1][y1];
			int val = 0;
			int min = 0;
			
			for(int j=x1;j<=x2;j++) {
				for(int y=y1;y<=y2;y++) {
					
					if(j==x1 || y == y1) {
						
					}
					val = start;
					
				}
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		int[] answer = {};
        
        
        
        return answer;
    }
}
