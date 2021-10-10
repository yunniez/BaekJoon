package Programmers;

import java.util.Arrays;

public class S23 {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		System.out.println(solution(array,commands));
	}
	
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++) {
        	int start = commands[i][0];	//������ ���ۼ�
        	int end = commands[i][1];	//������ ����
        	int count = commands[i][2];	//���Ϸ��� ���� ��ġ��

        	int[] newArray = new int[end-start];
        	newArray = Arrays.copyOfRange(array, start-1, end);
        	Arrays.sort(newArray);
        	answer[i] = newArray[count-1];
        }
        
        return answer;
    }
}
