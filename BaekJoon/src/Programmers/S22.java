package Programmers;

public class S22 {
	public static void main(String[] args) {
		String[] seoul ={"Jane", "Kim"};
		System.out.println(solution(seoul));
		
	}
	
	public static String solution(String[] seoul) {
        String answer = "";
        int count = 0;
        
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                count = i;
            }
        }
        
        answer = "�輭���� " + count + "�� �ִ�.";
        
        return answer;
    }
}
