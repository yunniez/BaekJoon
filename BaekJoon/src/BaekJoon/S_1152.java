package BaekJoon;

import java.util.Scanner;

public class S_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
        int count = 1;
		int idx = (int)' ';
		System.out.println(idx);
        
		if(str.isEmpty()) {
			count = 0;
		}
		
		for (int i=0; i<str.length(); i++) {
			 if(str.charAt(i)==idx) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
