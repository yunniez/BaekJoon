package BaekJoon;

import java.util.Scanner;

public class S_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int count = sc.nextInt();
			String[] word = sc.next().split("");
			
			for(int i=0;i<word.length;i++) {
				for(int j=0;j<count;j++) {
					System.out.print(word[i]);
				}
			}
			
			System.out.println();
		}
	}
}
