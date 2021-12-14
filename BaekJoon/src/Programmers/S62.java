package Programmers;

public class S62 {
	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		System.out.println(solution(a,b));
	}
	
	
	public static String solution(int a, int b) {
        String answer = "";
        
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] name = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        int length = 0;
        answer.startsWith(answer);
        
        int sum = 0;
        
        for(int i=0;i<a-1;i++) {
        	sum += days[i];
        	System.out.println(sum);
        }
        
        sum += b;
        
        if(sum%7 == 0){
            answer = "THU";
        }else{
            answer = name[(sum%7)-1];
        }
        
        return answer;
    }
}