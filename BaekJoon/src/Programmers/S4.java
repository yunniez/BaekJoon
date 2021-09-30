package Programmers;

public class S4 {
	public static void main(String[] args) {
		String s="one4seveneight";
		int k = solution(s);
		System.out.println(k);
		
	}
	
	
	public static int solution(String s) {
		
		if(s.length() >= 1 && s.length() <=50) {
	        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	        for(int i=0;i<numStr.length;i++){
	            s = s.replaceAll(numStr[i],String.valueOf(i));
	        }
		}
        return Integer.parseInt(s);
	}
}