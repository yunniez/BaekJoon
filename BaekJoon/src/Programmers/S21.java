package Programmers;

public class S21 {
	public static void main(String[] args) {
		String s="1234";
		System.out.println(solution(s));
	}
	
	
	public static boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();

        if(ch.length == 4 || ch.length==6) {
        	for(int i =0;i<ch.length;i++) {
        		if(!Character.isDigit(ch[i])) {
        			answer = false;
        			break;
        		}else {
        			answer = true;
        		}
        	}
        }else {
        	answer = false;
        }
        
        return answer;
    }
}
