package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class S_11720 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] num =br.readLine().split("");
        int sum = 0;
        
        for(int i=0;i<count;i++) {
        	int temp = Integer.parseInt(num[i]);
        	sum += temp;
        }
        
        System.out.println(sum);
    }
}
