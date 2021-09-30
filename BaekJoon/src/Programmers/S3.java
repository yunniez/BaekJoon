package Programmers;
// 프로그래머스 
public class S3 {
	public static void main(String[] args) {
		String new_id="...!@BaT#*..y.abcdefghijklm";
		
		System.out.println(solution(new_id));
	}
	
	public static String solution(String new_id) {
        /*
    1단계 new_id의 모든 소문자로 치환. (lowerCase())
    2단계 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거 
    3단계 new_id에서 마침표(.)가 2번 이상 -> 하나의 마침표(.)로 치환 replace
    4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거 trim
    5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입 if(new_id=null) new_id="a"
    6단계 new_id 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거 subString(0,15)
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    7단계 new_id의 길이가 2자 이하라면, 
    new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.*/
        
		
		
        String answer = new_id.toLowerCase().replaceAll("[^a-z0-9-._]", "").replaceAll("[.]{2,}", ".").replaceAll("^[.]|[.]$", "");
        answer = answer.length() == 0 ? "a" : answer;
        answer = answer.length() > 15 ? answer.substring(0,15).replaceAll("^\\.|\\.$", "") : answer;
        while(answer.length() < 3) {
        	answer += answer.substring(answer.length()-1);
        }
        
        return answer;
    }
}
