package Programmers;

public class S13 {
	
	public static void main(String[] args) {
		String s = "abcde";
		String answer = solution(s);
		System.out.println(answer);
	}
	
	public static String solution(String s) {
        String answer = "";
        
        if(s.length()%2==0) {
        	answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else{
        	answer = s.substring(s.length()/2,s.length()/2+1);
        }
        return answer;
    }
}
