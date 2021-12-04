package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

// 레벨 2 더 맵게
//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

public class S38 {
	
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(scoville, K));
	}

	public static int solution(int[] scoville, int K) {

		//섞이는 횟수
        int answer = 0;
        
        //우선순위 큐 -> 나올 때는 우선순위 노드 따라서 나오게 됨
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
