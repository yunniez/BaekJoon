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
        
        //N = ���������� ����
        //stages = �� ������� ���� �������� ��������
        //���Ϸ��� �� = �������� ���� ���� ������������ ��������
        //������ �� = �������� ���� ���ٰ� �������� ���� �� �ƴ�
        
        //num = �÷��̾� �ε���, state = �÷��̾� ��ġ
        int[] state = new int[n+1];
		for(int num : stages) {
			if(num == n+1) continue;
			state[num]++;
		}
		
		Map<Integer, Double> failure = new HashMap<Integer, Double>();
		//�÷��̾��
		int total = stages.length;
		for(int i=1; i<n+1; i++) {
			//�÷��̾� ������
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
		//��������
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
