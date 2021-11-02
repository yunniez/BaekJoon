package Programmers;

import java.util.Arrays;
import java.util.HashMap;

/* 답안은 통과했으나 런타임 에러 난 코드...
 * for(int i = 0; i<phone_book.length;i++) {
	for(int j = i+1; j<phone_book.length;j++) {
		if(phone_book[j].substring(0, phone_book[i].length()).equals(phone_book[i])) {
    		answer = false;
    		break;
    	}
		
		if(answer == false) {
			break;
		}
	}
	
	if(answer == false) {
		break;
	}
}*/



public class S39 {
	public static void main(String[] args) {
		String[] phone_book = {"1134", "1124", "11341124"};
		System.out.println(solution(phone_book));
	}
	
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, String> map = new HashMap<String, String>();
        
        //Arrays.sort(phone_book);
        
        for(String num : phone_book) {
        	map.put(num, "0");
        }
        
        for(String k : map.keySet()) {
        	for(int i = 1; i<k.length();i++) {
        		System.out.println(k);
    			System.out.println(k.substring(0, i));
    			
    			//키값의 한글자씩 뽑아내서 다른 키값과 동일한 수가 있을 때 false
        		if(map.containsKey(k.substring(0, i))) {
        			answer = false;
        			break;
        		}
        		
        		if(answer == false) break;
        	}
        	
        	if(answer == false) break;
        }
        
        return answer;
    }
}
