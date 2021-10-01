package Programmers;
//programmers 8주차 위클리
public class S7 {
	public static void main(String[] args) {
		
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		int answer = solution(sizes);
		System.out.println(answer);
	}
	
	
	public static int solution(int[][] sizes) {
        int answer = 0;
        
        int wMax = 0;
        int hMax = 0;
        
       for(int i=0;i<sizes.length;i++) {
    	   for(int j=1;j<sizes[i].length;j++) {
    		   if(sizes[i][j] > sizes[i][j-1]) {
    			   int temp = sizes[i][j-1];
    			   sizes[i][j-1] = sizes[i][j];
    			   sizes[i][j]=temp;
    		   }
    	   }
       }
       
       
		for(int i=0;i<sizes.length;i++) { 
			if(sizes[i][0] > wMax) { 
				wMax =sizes[i][0]; 
			}
		 
			if(sizes[i][1] > hMax) {
				hMax = sizes[i][1]; 
			}
		
		} 
		
		answer = wMax * hMax;
		
        return answer;
    }
}
