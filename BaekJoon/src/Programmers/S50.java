package Programmers;

import java.util.Arrays;

public class S50 {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3, 1};
		System.out.println(Arrays.toString(solution(prices)));
		
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
	    
        for(int i=0;i<prices.length;i++) { 
            if(prices.length == i) { 
                answer[i] = 0;
            }else { 
                for(int j=i+1;j<prices.length;j++) { 
                	answer[i]++;
                    if(prices[i] > prices[j]) {
                        break; 
                    }
                }
	        } 
        }
        
        return answer;
    }
	
}
