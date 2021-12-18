package Programmers;

public class S65 {
	
	public static void main(String[] args) {
		String s = "try hello world   ";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
        String answer = "";
        
        //-1이 없을시 뒷부분 공백인 경우 누락됨
        //https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String,%20int)
        String[] str = s.split(" ", -1);
        
        for(int i=0;i<str.length;i++) {
            
        	for(int k=0;k<str[i].length();k++) {
        		String ans = str[i].substring(k, k+1);
        		if(k%2 == 0) {
        			answer += ans.toUpperCase();
        		}else{
        			answer += ans.toLowerCase();
        		}
        	}
        	if(i== str.length-1) break;
        	answer += " ";
        }
        
        
        return answer;
    }
}
