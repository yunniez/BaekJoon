package Programmers;

//프로그래머스 소수 만들기 (1단계)

public class S29 {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
        //카운트한 갯수(정답)
		int answer = 0;
		
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++) {
            	for(int k=j+1;k<nums.length;k++) {
            		int sum = (nums[i] + nums[j] + nums[k]);
            		
            		int count = 0;
            		//애초에 3개의 숫자를 뽑았을 때 sum이 2이하로 나올 수가 없음
            		//따라서 2를 제외하는 조건은 제외
            		
            		//소수의 갯수를 구하기 위해서 for문을 돌린다
            		for(int a=2;a<sum+1;a++) {
            			if(sum%a == 0) {
            				count++;
            				
            				if(count > 1) {
            					break;
            				}
            			}
            			
            		}//end of for
            		if(count == 1) {
    					answer++;
    				}
            	}
            }
        }
        return answer;
    }
	
}
