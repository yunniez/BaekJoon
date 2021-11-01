package Programmers;

public class S31 {
	public int[] solution(long n) {
	    int idx = 0;
        
	    String temp = "" + n;
	    
        int[] answer = new int[temp.length()];
        
        while(n > 0) {
        	answer[idx] = (int) (n%10);
        	n /= 10;
        	idx ++;
        }
        
        return answer;
    }
}
