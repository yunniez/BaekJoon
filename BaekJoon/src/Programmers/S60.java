package Programmers;

import java.util.Arrays;

public class S60 {
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		System.out.println(solution(n, arr1, arr2));
	}
	
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] arr = new String[n][n];
        
        for(int i=0;i<arr1.length;i++) {
            //2진수로 모두 변경한다
        	String str1 = Integer.toBinaryString(arr1[i]);
        	String str2 = Integer.toBinaryString(arr2[i]);
        	
        	while(str1.length() < n) {
        		str1 = "0" + str1;
        	}
        	
        	while(str2.length() < n) {
        		str2 = "0" + str2;
        	}
        	
        	String[] strArr1 = str1.split("");
        	String[] strArr2 = str2.split("");

        	System.out.println(Arrays.toString(strArr1));
        	System.out.println(Arrays.toString(strArr2));
        	
        	for(int j=0;j<n;j++) {
        		if(strArr1[j].equals("0") && strArr1[j].equals(strArr2[j])) {
        			strArr1[j] = " ";
        		}else {
        			strArr1[j] = "#";
        		}
        	}
        	String ans = "";
        	
        	for(int j=0;j<n;j++) {
        		ans += strArr1[j];
        	}
        	
        	System.out.println(ans);
        }
        
        
        
        return answer;
    }
}
