package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class S_1874 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N  = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int start = 1;
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num >= start){
                for(int j = start; j <= num; j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                start = num + 1;
            }
            else if(num != stack.peek()){
                System.out.println("NO");
            }
            while(!stack.empty()){
                sb.append("-\n");
                if(stack.pop() == num) break;
            }
        }
        System.out.println(sb.toString());
		
	}

}
