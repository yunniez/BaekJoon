package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S20 {
	public static void main(String[] args) {
		int[] arr = {6,5,2,3,7,8};
		int divisor = 10;
		
		System.out.println(solution(arr,divisor));
	}
	
	
	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();
        
        for(int i : arr) {
        	if(i%divisor==0) {
        		list.add(i);
        	}
        }
        
        int[] answer = new int[list.size()];
        
        if(list.isEmpty()) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        
        for(int i=0;i<list.size();i++) {
        	answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        for(int i=0;i<answer.length;i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}
