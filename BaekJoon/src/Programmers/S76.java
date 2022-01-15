package Programmers;

import java.util.ArrayList;

public class S76 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(solution(n));
	}
	
	public static String solution(int n) {
		String answer = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(n > 0) {
        	if(n%3 == 0) {
        		list.add(0, 4);
        		n--;
        	}else
        		list.add(0, n%3);
        		n /= 3;
        }
        
        for(Integer a : list) {
        	answer += (a + "");
        }
        return answer;
	}
}
