package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//기능개발
//11번만 안됐었는데 분모에 double을 걸어주지 않을 시 자동캐스팅 되어 당연하게 자연수로 떨어지는 것이었음
//https://programmers.co.kr/questions/16920

public class S47 {
	public static void main(String[] args) {
		int[] progresses = {96,94};
		int[] speeds = {3,3};
		
		System.out.println(solution(progresses,speeds));
		
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {

        int count = 0;
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int temp : progresses) {
        	q.add(temp);
        }
        
        for(int i=0;i<speeds.length;i++) {

            int com = (int) Math.ceil((100-q.poll())/(double)speeds[i]);
            
            q.add(com);
        }

        System.out.println(q.toString());
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(!q.isEmpty()) {
        	for(int i=0;i<q.size();i++) {
        		if(q.peek() >= (int)q.toArray()[i]) {
        			count++;
        		}else {
        			break;
        		}
        	}

			list.add(count);
	        System.out.println("list : " + list);
	        
			for(int k=0;k<count;k++) {
				q.poll();
			}
			count = 0;
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++) {
        	answer[i] = list.get(i);
        }

        return answer;
    }
}
