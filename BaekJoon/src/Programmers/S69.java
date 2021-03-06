package Programmers;

public class S69 {
	public static void main(String[] args) {
		int n = 125;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        String str = "";
        while(n > 0) {
        	int num = n%3;
        	str += String.valueOf(num);
        	n = (n - num) /3;
        }
        
        int idx = 1;
        int length = str.length()-1;
        
        while(length >= 0) {
        	String[] arr = str.split("");
        	answer += idx * (Integer.parseInt(arr[length]));
        	idx *= 3;
        	length--;
        }
        
        return answer;
    }
}
