package Programmers;

import java.util.ArrayList;

public class S42 {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		System.out.println(solution(arr));
	}
	
	
	public static int[] solution(int[] arr) {
		
		int[] answer = null;
		
		//1번 arr.length 1인 경우 -1 return
		if(arr.length == 1) {
			answer = new int[] {-1};
		//2번 arr.length가 1이 아닌 경우
		}else {
	        answer = new int[arr.length-1];
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        int min = arr[0];
	        int idx = 0;
	        
	        for(int i = 0; i<arr.length;i++) {
	        	list.add(arr[i]);
	        	
	        	if(min > arr[i]) {
	        		min = arr[i];
	        		idx = i;
	        	}
	        }
	        
	        list.remove(idx);
	        
	        for(int i = 0;i<list.size();i++) {
	        	answer[i] = list.get(i);
	        	System.out.println(list.get(i));
	        }
	        
		}

        return answer;
    }

}
