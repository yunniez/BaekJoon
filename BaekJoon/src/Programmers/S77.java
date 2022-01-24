package Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class S77 {
	public static void main(String[] args) {
		String[] id = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		System.out.println(solution(id, report, k));
	}
	
	
	public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Object> map = new HashMap<String, Object>();
        
        for(int i=0;i<id_list.length;i++) {
            HashSet<String> repList = new HashSet<String>();
        	for(int j=0;j<report.length;j++) {
            	String[] tmp = report[j].split(" ");
        		if(tmp[1].equals(id_list[i])) {
        			repList.add(tmp[0]);
        		}
        	}
        	if(repList.size() >= k) {
            	map.put(id_list[i], repList);
        	}
        }

        Map<String, Integer> count = new HashMap<String, Integer>();
        for(String id : id_list) count.put(id, 0);
        
        for(int i=0;i<id_list.length;i++) {
        	int cnt = 0;
        	for(int j=0;j<id_list.length;j++) {
        		if(map.containsValue(id_list[j])) {
	    			cnt++;
	    		}
        	}
    		count.replace(id_list[i], cnt);
	    	System.out.println(count);
        }

        
        
        return answer;
    }
}
