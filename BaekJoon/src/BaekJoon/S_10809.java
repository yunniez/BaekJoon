package BaekJoon;

import java.util.Scanner;

public class S_10809 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		int[] answer = new int[26];
		
		for(int i=0;i<answer.length;i++) {
			answer[i] = -1;
		}
		
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			
			if(answer[c - 'a'] == -1) {
				answer[c - 'a'] = i;
			}
			
		}
		
		for(int temp : answer) {
			System.out.print(temp + " ");
		}
		
	}
	
}
