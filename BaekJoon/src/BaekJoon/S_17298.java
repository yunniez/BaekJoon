package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class S_17298 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//�׽�Ʈ ���̽� ��
		int count = Integer.parseInt(br.readLine());
		//������ ��
		String[] line = br.readLine().split(" ");

		int[] answer = new int[count];
		for(int i=0;i<count;i++)
			answer[i] = -1;
		
		Stack<int[]> stack = new Stack<int[]>();
		
		for (int i=0; i<count; i++) {
			//���� ���� ��
			int number[] = new int [2];
			number[0] = Integer.parseInt(line[i]);
			number[1] = i;	//�Է¼���

			if(stack.isEmpty())
				stack.push(number);
			else {
				while(!stack.isEmpty() && stack.peek()[0] < number[0]) {
					answer[stack.peek()[1]] = number[0];
					stack.pop();
					continue;
				}
				stack.push(number);
			}
		}
		
		for(int a : answer) bw.append(a+" ");
		bw.close();
		br.close();
	}

}
