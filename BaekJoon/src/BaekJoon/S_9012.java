package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class S_9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());

		Stack<String> s = new Stack<String>();
		
		for(int i=0;i<count;i++){
            String str = br.readLine();
            String answer = "YES";
            Stack<Integer> stack = new Stack<>();

            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '(')
                    stack.push(1);

                else if(stack.empty()) {
                    answer = "NO";
                    break;
                }

                else stack.pop();
            }
            
            if(!stack.empty()) answer = "NO";

            System.out.println(answer);
        }
	}
}
