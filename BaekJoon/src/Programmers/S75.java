package Programmers;

public class S75 {
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50}; 
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		System.out.println(solution(n, arr1, arr2));
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++) {
        	String num1 = Integer.toBinaryString(arr1[i]);
        	String num2 = Integer.toBinaryString(arr2[i]);
        	
        	while(num1.length() < n) {
        		num1 = "0" + num1;
        	}
        	
        	while(num2.length() < n) {
        		num2 = "0" + num2;
        	}
        	
        	String temp = "";
        	
        	for(int j=0;j<num1.length();j++) {
        		if(num1.substring(j, j+1).equals("1") || num2.substring(j, j+1).equals("1")) {
        			temp += "#";
        		}else {
        			temp += " ";
        		}
        	}
        	answer[i] = temp;
        	System.out.println(temp);
        }
        
        
        return answer;
    }
}
