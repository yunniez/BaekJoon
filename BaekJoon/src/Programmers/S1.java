package Programmers;
//프로그래머스 약수의 합
public class S1 {
	public int solution(int n) {
        //약수의 합
        int answer = 0;
        
        for(int i=1;i<3001;i++){
            if(n%i == 0 && n > 0) {
            	answer += i;
            }
        }
        return answer;
    }
}
