package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S27 {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] answer = solution(N,stages);
		
		for(int i=0;i<N;i++) {

			System.out.println(answer[i]);
		}
		
	}

	
	public static int[] solution(int n, int[] stages) {
        int[] answer = new int[n];
        
        //N = 스테이지의 개수
        //stages = 각 사람들이 현재 도전중인 스테이지
        //구하려는 값 = 실패율이 가장 높은 스테이지부터 내림차순
        //주의할 것 = 스테이지 수가 높다고 실패율이 높은 건 아님
        
        //num = 플레이어 인덱스, state = 플레이어 위치
        int[] state = new int[n+1];
		for(int num : stages) {
			if(num == n+1) continue;
			state[num]++;
		}
		
		Map<Integer, Double> failure = new HashMap<Integer, Double>();
		//플레이어수
		int total = stages.length;
		for(int i=1; i<n+1; i++) {
			//플레이어 없을때
			if(total==0) {
				failure.put(i, (double)0);
			}
			else {
				double rate = (double)state[i]/(double)total;
				total-=state[i];
				failure.put(i, rate);
			}
		}
		
		List<Integer> list = new ArrayList<>(failure.keySet());
		//내림차순
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Double.compare(failure.get(o2), failure.get(o1));
			}
		});
		
		for(int i=0; i<n; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
