package Programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S10 {
	
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		String answer = solution(participant,completion);
		System.out.println(answer);
	}
	
	//1번 방법
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap();
    	
    	for(String per : participant) {
    		if(map.get(per) == null) {
    			map.put(per, 1);
    		} else { // 동명이인 처리
    			map.put(per, map.get(per) + 1); 
    		}
    	}
    	
    	for(String com : completion) {
    			map.put(com, map.get(com) - 1);
    	}
    	
    	for(String set : map.keySet()) { 
    		if(map.get(set) != 0) {
    			answer += set;
    		}
    	}

        return answer;

    }
	
}
