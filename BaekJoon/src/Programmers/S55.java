package Programmers;

import java.util.Arrays;

public class S55 {
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		System.out.println(solution(d, budget));
	}
	
	public static int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        int sum = 0;
        
        for(int i : d) {
        	sum += i;
        	if(sum > budget) break;
        	answer++;
        }
        
        return answer;
    }
}
