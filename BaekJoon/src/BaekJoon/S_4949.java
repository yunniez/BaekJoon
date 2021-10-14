package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class S_4949 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String str = br.readLine();
			if(str.equals("."))
				break;
			String answer = ""; // 여러 문자들 중 괄호만 추가
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)=='(' || str.charAt(i)==')' || 
						str.charAt(i)=='{' || str.charAt(i)=='}' ||
						str.charAt(i)=='[' || str.charAt(i)==']') {
					answer += str.charAt(i);
				}
			}
			String bracket = "\\(\\)|\\{\\}|\\[\\]"; //() 또는 {} 또는 [] 인 문자열 제거하기 위한 정규표현식
			while(answer.length() != (answer = answer.replaceAll(bracket, "")).length());
			if(answer.length()==0) {
				bw.append("YES\n");
			} else {
				bw.append("NO\n");
			}
		}
		bw.flush();
	}
}