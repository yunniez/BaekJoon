package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

// ���� 2 �� �ʰ�
//���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)

public class S38 {
	
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(scoville, K));
	}

	public static int solution(int[] scoville, int K) {

		//���̴� Ƚ��
        int answer = 0;
        
        //�켱���� ť -> ���� ���� �켱���� ��� ���� ������ ��
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i : scoville) {
	         q.add(i);
	    }
		
		while(q.peek() < K) {
			int a = q.poll();
			if (q.isEmpty()) {
                if (a < K) return -1;
            }
            int b = q.poll();
            q.add(a + b * 2);
            answer++;
		}
        return answer;
    }
	
	
}
