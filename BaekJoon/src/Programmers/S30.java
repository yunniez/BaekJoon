package Programmers;

import java.util.ArrayList;
import java.util.List;

//1번 12345
//2번 21232425
//3번 3311224455

public class S30 {
	
	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		
		System.out.println(solution(answers));
	}
	
	public static int[] solution(int[] answers) {
		int[] person1 = {1, 2, 3, 4, 5};
		int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		
		for(int i=0;i<answers.length;i++) {
			if(answers[i] == person1[i%5]) {
				count1++;
			}
			
			if(answers[i] == person2[i%8]) {
				count2++;
			}
			
			if(answers[i] == person3[i%10]) {
				count3++;
			}
			
		}
		
		//최댓값 구하는 함수
		int max = Math.max(Math.max(count1, count2), count3);
		
		List<Integer> list = new ArrayList<Integer>();
		if(max==count1) list.add(1);
		if(max==count2) list.add(2);
		if(max==count3) list.add(3);
		
		System.out.println(list);
		
		int[] answer = new int[list.size()];
		System.out.println(list.size());
		System.out.println(answer.length);
		
		for(int i=0;i<list.size();i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
    }
}
