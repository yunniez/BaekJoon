package Programmers;

//���α׷��ӽ� �Ҽ� ����� (1�ܰ�)

public class S29 {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
        //ī��Ʈ�� ����(����)
		int answer = 0;
		
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++) {
            	for(int k=j+1;k<nums.length;k++) {
            		int sum = (nums[i] + nums[j] + nums[k]);
            		
            		int count = 0;
            		//���ʿ� 3���� ���ڸ� �̾��� �� sum�� 2���Ϸ� ���� ���� ����
            		//���� 2�� �����ϴ� ������ ����
            		
            		//�Ҽ��� ������ ���ϱ� ���ؼ� for���� ������
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
