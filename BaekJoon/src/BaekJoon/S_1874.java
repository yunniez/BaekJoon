package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class S_1874 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //테스트 케이스 갯수
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        //시작 위치
        int start = 1;
        for(int i=0;i<count;i++){
        	//데이터 값
            int num = Integer.parseInt(br.readLine());
            if(num >= start){
                for(int j=start;j<=num;j++){
                    stack.push(j);
                    bw.append("+\n");
                }
                start = num+1;
            }
            else if(num!=stack.peek()){
                System.out.println("NO");
            }
            
            while(!stack.empty()){
                bw.append("-\n");
                if(stack.pop() == num) break;
            }
        }
        bw.flush();
		bw.close();
	}

}
