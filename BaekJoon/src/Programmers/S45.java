package Programmers;

import java.util.HashMap;

public class S45 {
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		
		System.out.println(solution(n, lost, reserve));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        //���� ü���� �ִ� �ֵ� 1 �ڱ�͸� �ִ� �ֵ� 0 ���� �ֵ� -1
        int answer = 0; 
		
        //���� �ֵ� ����Ʈ
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 1; i<n+1; i++) {
        	map.put(i, 0);
        }

        for(int temp : lost) {
        	if(map.containsKey(temp)) {
        		map.put(temp, -1);
        	}
        }
        
        for(int temp : reserve) {
        	map.put(temp, 1);
        }
        

		//����ü���� �ִµ� �ڱ⵵ ���������� ��
        for(int i=0; i<lost.length; i++){ 
			for(int j=0; j<reserve.length; j++){ 
				if(lost[i]==reserve[j]){ 
					lost[i] = 0;
					reserve[i] = 0;
					break; 
					} 
				} 
			} 
        
        for(int temp : lost) {
        	if(map.get(temp + 1) == 1) {
        		map.put(temp, 0);
        		map.put(temp+1, 0);
        	}else if(map.get(temp -1) == 1) {
        		map.put(temp, 0);
        		map.put(temp-1, 0);
        	}
        }
		
        for(int i = 1; i<=map.size();i++) {
        	if(map.get(i) >= 0) {
        		answer++;
        	}
        }
		
		return answer;
    }
}
