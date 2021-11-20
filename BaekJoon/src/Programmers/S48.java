package Programmers;

public class S48 {
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		System.out.println(solution(numbers,target));
	}
	
	
	public static int answer = 0;
    
	public static void dfs(int[] numbers, int target, int index){
		// base case:
		if(index == numbers.length){
			int sum = 0;
			for(int i=0; i<numbers.length; i++) 
				sum += numbers[i];

			answer += (sum == target) ? 1 : 0;  /* �հ� target�� ������ +1 �ٸ��� +0 */
			return;
		}

		dfs(numbers, target, index+1);	/* numbers�迭 ��� ����� �� ���� dfs Ž�� */
		numbers[index] *= -1;			/* ��� ��� �� base case�� ���� �Լ� �����ϰ� ���ܰ�� ���ư��� ���->����, ����->��� */
		System.out.println("index : " + index);
		dfs(numbers, target, index+1);	/* ������ ���� ������ �ٽ� ������ dfs Ž�� */

	}
    
    public static int solution(int[] numbers, int target) {
        dfs(numbers, target, 0);
        return answer;
    }
	
}
