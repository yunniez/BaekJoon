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
		//테스트 케이스
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0;i<test;i++) {
			//문서 갯수, 구하려는 문서의 인덱스
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			
			//문서의 중요도
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			//큐
			Queue<Integer> q = new LinkedList<Integer>();
			
			//문서의 중요도를 list에 쭉 넣기
			for(int j=0;j<c;j++) {
				list.add(Integer.parseInt(st2.nextToken()));
				q.offer(Integer.parseInt(st2.nextToken()));
			}
			
			while(!q.isEmpty()) {
								
				
			}
			
		}
	
		
	}
}
