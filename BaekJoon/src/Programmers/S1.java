package Programmers;
//���α׷��ӽ� ����� ��
public class S1 {
	public int solution(int n) {
        //����� ��
        int answer = 0;
        
        for(int i=1;i<3001;i++){
            if(n%i == 0 && n > 0) {
            	answer += i;
            }
        }
        return answer;
    }
}
