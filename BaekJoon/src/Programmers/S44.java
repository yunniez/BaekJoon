package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class S44 {
	public static void main(String[] args) {
		int[] priorities = {2, 1, 7, 8, 1, 2, 3, 2};
		int location = 0;
		
		System.out.println("answer : " + solution(priorities,location));
		
	}

    public static int solution(int[] priorities, int location) {
    	
    	//���°�� ����
        int answer = 1;
        
        //�켱���� ť
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for (int i : priorities) {
            q.add(i);
        }

    	System.out.println("ó�� q�� ���ִ� �迭 : " + q);
        
        while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == q.peek()) {
                	
                	System.out.println("a : " + answer);
                	System.out.println("i : " + i);
                    
                	if (location == i) {
                        return answer;
                    }
                    answer++;
                    q.poll();
                    System.out.println(q);
                	System.out.println();
                    
                }
            }
        }
        
        return answer;
    }
    
}
