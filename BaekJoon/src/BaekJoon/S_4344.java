package BaekJoon;

import java.util.Scanner;

/*
 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. 
 * ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 * 
 */

public class S_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();//�׽�Ʈ���̽� ����
		int[] score =null;
		
		for(int i=0;i<c;i++) {
			int sum = 0;
			float avg = 0;
			
			int num = sc.nextInt();
			score = new int[num];
			
			//�� ���� �迭�� �ֱ�
			for(int j=0;j<num;j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avg = (sum/num);
			int count = 0;	//�� ���� ��� �̻�����
			float per = 0;	//��� �̻��� ����
			
			for(int j=0;j<num;j++) {
				if(score[j] > avg) {
					count++;
				}
			}
			
			per = ((float)count/num)*100;
			System.out.println(String.format("%.3f", per) + "%");
		}
	}
}
