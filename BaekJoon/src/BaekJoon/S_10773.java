package BaekJoon;

/*첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.*/

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
		
		System.out.println(stack);
		System.out.println(stack.size());
		
		//안되는 방법(출력 결과 : 6 -> 오답)
		/*
		 * stack = [1, 6]; for(int i=0;i<stack.size();i++) { sum += stack.pop(); }
		 */
		
		//되는 방법(출력 결과 : 7 -> 정답)
		
		 for(int temp : stack) { sum += temp; }
		 
		
		System.out.println(sum);
		
	}
}
