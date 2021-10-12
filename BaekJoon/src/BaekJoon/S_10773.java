package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S_10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//테스트케이스 수
		int count = Integer.parseInt(br.readLine());
		//총합
		int sum = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(count > 0) {
			//부르는 번호
			int num = Integer.parseInt(br.readLine());
			
			if(num!=0) {
				stack.add(num);
			}else {
				stack.pop();
			}
			count--;
		}
		
		for(int temp : stack) {
			sum += temp;
		}
		
		System.out.println(sum);
		
	}
}
