package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class S_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] n = new int[num];
		
		for(int i=0;i<num;i++) {
			n[i] = sc.nextInt();
		}
		
		Arrays.sort(n);
		
		for(int i : n) {
			System.out.println(i);
		}
		
	}
}
