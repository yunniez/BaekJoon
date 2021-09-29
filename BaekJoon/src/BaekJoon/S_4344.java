package BaekJoon;

import java.util.Scanner;

/*
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 
 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 * 
 */

public class S_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();//테스트케이스 갯수
		int[] score =null;
		
		for(int i=0;i<c;i++) {
			int sum = 0;
			float avg = 0;
			
			int num = sc.nextInt();
			score = new int[num];
			
			//각 수를 배열에 넣기
			for(int j=0;j<num;j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avg = (sum/num);
			int count = 0;	//몇 명이 평균 이상인지
			float per = 0;	//평균 이상의 비율
			
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
