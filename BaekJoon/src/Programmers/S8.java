package Programmers;

public class S8 {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,6,7,8,0};
		int answer = solution(numbers);
		System.out.println(answer);
	}
	
	
	public static int solution(int[] numbers) {
        int answer = 0; //����
        //answer�� 0~9���� ���� ����
        for(int i=0;i<10;i++) {
        	answer += i;
        }
        
        for(int i=0;i<numbers.length;i++) {
        	answer -= numbers[i];
        }
        
        return answer;
    }
}
