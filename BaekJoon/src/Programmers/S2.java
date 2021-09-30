package Programmers;

//프로그래머스 로또의 최고 순위와 최저순위
public class S2 {
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int[] ans = solution(lottos, win_nums);
		
		System.out.println(ans[0] + "," + ans[1]);
	}
	
	
	public static int[] solution(int[] lottos, int[] win_nums) {
        //최고 많이 맞았을 때
        int max = 0;
        //최저 맞았을 때
        int min = 0;
        
        for(int i=0;i<lottos.length;i++){
        	for(int j=0;j<lottos.length;j++) {
                if(lottos[i] == win_nums[j]){
                    min++;
                    max++;
                }
                if(lottos[i] == 0) {
                	lottos[i]=win_nums[0];
                	if(lottos[i] == win_nums[j]){
                        max++;
                    }
                }
        	}
        }
        int[] answer = {max, min};
        
        for(int i=0;i<2;i++) {
	        if(answer[i]==1 || answer[i] == 0) {
	        	answer[i]=6;
	        }else if(answer[i]==2) {
	        	answer[i]=5;
	        }else if(answer[i]==3) {
	        	answer[i]=4;
	        }else if(answer[i]==4) {
	        	answer[i]=3;
	        }else if(answer[i]==5) {
	        	answer[i]=2;
	        }else if(answer[i]==6) {
	        	answer[i]=1;
	        }
        }
        return answer;
    }
}
