package Programmers;

public class S26 {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(solution(num));
	}
	
	public static String solution(int num) {
		String answer = "";
        
        int mnum = Math.abs(num);
        
        if(mnum%2==0){
            answer = "Even";
        }else if(mnum%2==1){
            answer = "Odd";
        }
        
        return answer;
    }
}
