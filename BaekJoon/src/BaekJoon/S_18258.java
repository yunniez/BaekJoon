package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class S_18258 {
	public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			Queue<Integer> q = new LinkedList<Integer>();
			
			//테스트 케이스 갯수
			int count = Integer.parseInt(br.readLine());
			int[] answer = new int[count];
			
			String back="";
			
			for(int i=0;i<count;i++) {
				String str = br.readLine();
				
				if(str.contains("push")) {
					String[] tk = str.split(" ");
					int num = Integer.parseInt(tk[1]);
					q.add(num);
					back = String.valueOf(num);
				}else if(str.contains("pop")) {
					bw.write(q.isEmpty() ? "-1\n":String.valueOf(q.poll()) + "\n");
				}else if(str.contains("size")) {
					bw.write(q.size()+"\n");
				}else if(str.contains("empty")) {
					bw.write(q.isEmpty() ? "1\n":"0\n");
				}else if(str.contains("front")) {
					bw.write(q.isEmpty() ? "-1\n":String.valueOf(q.peek()) + "\n");
				}else if(str.contains("back")) { 
					bw.write(q.isEmpty() ? "-1\n":back + "\n");
				}
			}
			bw.flush();
			bw.close();
		}
}
