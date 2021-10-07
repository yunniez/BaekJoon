package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
1������ N������ N���� ����� ���� �̷�鼭 �ɾ��ְ�, ���� ���� K(�� N)�� �־�����. ���� ������� K��° ����� �����Ѵ�. 
�� ����� ���ŵǸ� ���� ������ �̷���� ���� ���� �� ������ ����� ������. �� ������ N���� ����� ��� ���ŵ� ������ ��ӵȴ�. 
������ ������� ���ŵǴ� ������ (N, K)-�似Ǫ�� �����̶�� �Ѵ�. ���� ��� (7, 3)-�似Ǫ�� ������ <3, 6, 2, 7, 5, 1, 4>�̴�.
N�� K�� �־����� (N, K)-�似Ǫ�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
