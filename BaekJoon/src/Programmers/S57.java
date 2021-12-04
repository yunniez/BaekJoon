package Programmers;

import java.util.Arrays;

public class S57 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        for(int i=arr.length-1;i>=0;i--){
            answer += arr[i]; 
        }
        
        return answer;
    }
}
