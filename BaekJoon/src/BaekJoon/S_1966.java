package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S_1966 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�׽�Ʈ ���̽�
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0;i<test;i++) {
			//���� ����, ���Ϸ��� ������ �ε���
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			
			//������ �߿䵵
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			//ť
			Queue<Integer> q = new LinkedList<Integer>();
			
			//������ �߿䵵�� list�� �� �ֱ�
			for(int j=0;j<c;j++) {
				list.add(Integer.parseInt(st2.nextToken()));
				q.offer(Integer.parseInt(st2.nextToken()));
			}
			
			while(!q.isEmpty()) {
								
				
			}
			
		}
	
		
	}
}
