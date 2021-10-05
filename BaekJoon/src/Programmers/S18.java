package Programmers;

public class S18 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		long an = solution(a,b);
		
		System.out.println(an);
	}
	
	public static long solution(int a, int b) {
        long answer = 0;
        
        if(a==b){
            answer = a;
        }else if(a < b) {
            for(int i=a;i<b+1;i++){
                answer += i;
            }
        }else if(a > b) {
            for(int i=b;i<a+1;i++){
                answer += i;
            }
        }
        
        return answer;
    }

}
