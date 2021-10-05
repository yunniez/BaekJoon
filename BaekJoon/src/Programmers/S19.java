package Programmers;

public class S19 {
	public static void main(String[] args) {
		int x = 2;
		int n = 4;
		System.out.println(solution(x,n));
	}
	
	
	public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        
        for(int i=1;i<n;i++){
                answer[i] = x*i;
            }
        
        return answer;
    }
}
