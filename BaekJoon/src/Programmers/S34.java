package Programmers;

import java.util.Scanner;

public class S34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(solution(num));
	}
	
	
	public static int solution(double num) {
        int answer = 0;
        
        while(!(num==1)){
            if(num%2 == 0){
	            num /= 2;
	            answer++;
            }else if(num%2 == 1){
                num = (num*3) + 1;
                answer++;
            }
            
            if(answer > 500){
                answer = -1;
                break;
            }
        }
        return answer;
	}
}
