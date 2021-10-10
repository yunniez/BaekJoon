package Programmers;

public class S24 {
	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(solution(s));
	}
	
	static boolean solution(String s) {
        boolean answer = false;
        int pCount = 0;
        int yCount = 0;
        
        String p = s.toLowerCase();
        char[] ch = p.toCharArray();
        
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]=='p') {
        		pCount++;
        	}else if(ch[i]=='y') {
        		yCount++;
        	}
        }
        
        if(pCount==yCount) {
        	answer = true;
        }

        return answer;
    }
}
