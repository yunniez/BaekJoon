package Programmers;

import java.util.Arrays;

public class S74 {
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(sizes));
	}
	
	
	public static int solution(int[][] sizes) {
        int max1 = 0;
        int max2 = 0;
        
        for(int i=0;i<sizes.length;i++) {
        	Arrays.sort(sizes[i]);
    		if(max1 < sizes[i][0]) {
    			max1 = sizes[i][0];
    		}
    		
    		if(max2 < sizes[i][1]) {
    			max2 = sizes[i][1];
    		}
        }
        return max1*max2;
    }
}
