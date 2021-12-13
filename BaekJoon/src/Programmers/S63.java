package Programmers;

public class S63 {
	public static void main(String[] args) {
		String new_id = ".a.";
		System.out.println(solution(new_id));
	}
	
	public static String solution(String new_id) {
        String answer = "";
        //첫번째 조건 정규표현식에서 [] 안에 $가 들어가면 안된다
        answer = new_id.toLowerCase().replaceAll("[^a-z0-9._\\-]", "").replaceAll("[.]{2,}", ".")
        		.replaceAll("^[.]", "").replaceAll("[.]$", "");
        
        if(answer.isEmpty()) {
        	answer += "a";
        }

        if(answer.length() >= 16) {
        	answer = answer.substring(0,15).replaceAll("^[.]", "").replaceAll("[.]$", "");
        }
        
        while(answer.length() <= 2) {
        	char c = answer.charAt(answer.length()-1);
        	answer += c;
        }
        
        return answer;
    }
}
