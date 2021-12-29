package Programmers;

public class S71 {
	public static void main(String[] args) {
		long n = 144;
		System.out.println(solution(n));
	}
	
	public static long solution(long n) {
        long sqrt = (long)(Math.sqrt(n));
        if(n == Math.pow(sqrt, 2))
            return (long)(Math.pow(sqrt +1, 2));
        else return -1;
    }
}
