package Programmers;

//레벨 2 기능개발

import java.util.ArrayList;
import java.util.List;

public class S37 {
	
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		System.out.println(solution(progresses, speeds));
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        
		List<Integer> list = new ArrayList<Integer>();
		
		//각 프로젝트가 며칠이 걸리는지 계산
		for(int i = 0; i<speeds.length;i++) {
			list.add((int) Math.ceil((100-progresses[i]) / speeds[i]));
		}
		
		int count = 0;
        
        int[] answer = new int[speeds.length];
        
        for(int i = 0; i<speeds.length;i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
