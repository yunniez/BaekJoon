	package Programmers;


public class S14 {
	public static void main(String[] args) {
		int[][] scores = {{50, 90}, {50, 87}};
		String a = solution(scores);
		System.out.println(a);
		
	}
	
	
	
	public static String solution(int[][] scores) {
        String answer = "";
        
        int max = scores[0][0];
        int min = scores[0][0];
        int sum = 0;
        float avg = 0;
        
        for(int i=0;i<scores.length;i++) {
        	for(int j=0;j<scores[i].length;j++) {
        		
        		//최고점 구하기
        		if(max < scores[i][j]) {
        			max = scores[i][j];
        		}
        		//최저점 구하기
        		if(min > scores[i][j]) {
        			min = scores[i][j];
        		}
        		
        		sum += scores[i][j];
        	}
        	
        	if(max==scores[i][i]) {
    			sum -= scores[i][i];
    		}
    		if(min==scores[i][i]) {
    			sum -= scores[i][i];
    		}
        	
        	
        	avg = sum/scores.length;
        	if(avg >= 90) {
        		answer += "A";
        	}else if(avg >= 80) {
        		answer += "B";
        	}else if(avg >= 70) {
        		answer += "C";
        	}else if(avg >= 50) {
        		answer += "D";
        	}else if(avg < 50) {
        		answer += "F";
        	}
        	
        	sum = 0;
        	avg = 0;
        	
        }
        
        
        return answer;
    
    }
}
