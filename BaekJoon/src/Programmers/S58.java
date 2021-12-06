package Programmers;

public class S58 {
    public long solution(long n) {
        long answer = -1;
        
        for(int i=1;i<n;i++){
            if(i*i==n){
                answer = (i+1)*(i+1);
                break;
            }
        }
        
        return answer;
    }
}

