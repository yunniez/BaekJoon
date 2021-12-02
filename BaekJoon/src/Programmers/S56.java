package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class S56 {
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
	
    public static long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        String[] temp = str.split("");
        Arrays.sort(temp, Collections.reverseOrder());
        
        String newStr = "";
        
        for(String i : temp) newStr += i;
        answer = Long.valueOf(newStr);
        
        return answer;
    }
	
}
