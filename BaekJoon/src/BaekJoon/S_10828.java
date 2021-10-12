package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class S_10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//테스트 케이스 갯수
		int count = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<count;i++) {
			String str = br.readLine();
			
			if(str.contains("push")) {
				String[] tk = str.split(" ");
				int num = Integer.parseInt(tk[1]);
				stack.push(num);
			}else if(str.contains("pop")) {
				bw.write(stack.empty() ? "-1\n":String.valueOf(stack.pop()) + "\n");
			}else if(str.contains("size")) {
				bw.write(stack.size()+"\n");
			}else if(str.contains("empty")) {
				bw.write(stack.empty() ? "1\n":"0\n");
			}else if(str.contains("top")) { 
				bw.write(stack.empty() ? "-1\n": stack.peek() + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
