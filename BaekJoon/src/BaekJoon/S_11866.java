package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 이제 순서대로 K번째 사람을 제거한다. 
한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
*/
public class S_11866 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] answer = solution(n,k);
		
        System.out.print("<");
		for(int i=0;i<answer.length;i++) {
			if(i==answer.length-1) {
				System.out.print(answer[i] + ">");
			}else {
				System.out.print(answer[i] + ", ");
			}
		}
	}
		
	
	public static int[] solution(int n, int k) {
		int[] answer = new int[n];
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=1;i<n+1;i++) {
			q.add(i);
		}
		while(!q.isEmpty()) {
			for(int i=0;i<n;i++) {
				for(int j=1;j<k;j++) {
					int temp = q.poll();
					q.add(temp);
				}
				answer[i] = q.poll();
			}
		}
		return answer;
	}
	
}
