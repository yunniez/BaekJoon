package Programmers;

public class S25 {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(solution(n));
	}
	
	public static String solution(int n) {
        String answer = "";
        for(int i=0;i<n;i++){
            if(i%2==1){
                answer += "¹Ú";
            }else if(i%2==0){
                answer +=  "¼ö";
            }
        }
        return answer;
    }
}
