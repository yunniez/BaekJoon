package Programmers;

public class S46 {
	public static void main(String[] args) {
		String s = "AaZz";
		int n = 25;
		
		System.out.println(solution(s, n));
	}
	
	public static String solution(String s, int n) {
		String answer = "";
				
		int z = (int)'z';
		int Z = (int)'Z';
		int a = (int)'a';
		int A = (int)'A';
		
		char[] temp = s.toCharArray();
		
		for(int i =0; i<temp.length; i++){
			
		  if(temp[i]>=a && temp[i]<=z){
		      temp[i] = (int)temp[i]+n > z ? (char)(a+(int)temp[i]+n-z-1) : (char)((int)temp[i]+n); 
		  }else if(temp[i]>=A&& temp[i]<=Z){
		      temp[i] = (int)temp[i]+n > Z ? (char)(A+(int)temp[i]+n-Z-1) : (char)((int)temp[i]+n);
		  }else{
		      temp[i]=temp[i];
		      }
		  }
		answer = new String(temp);
				
        return answer;
    }
}
