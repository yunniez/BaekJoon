package Programmers;

import java.util.*;

public class S16 {
	
	public int[] solution(int []arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				list.add(arr[i]);
			}
		}
		//answer�� ����� �̸� �˼� ���� ������ �� �ϴܿ� ��ġ�ؾ� ��
		int[] answer = new int[list.size()];
		
		for(int i=0;i<list.size();i++) {
			answer[i] = list.get(i);
		}
		
        return answer;
    }
}
