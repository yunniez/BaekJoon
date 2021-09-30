package Programmers;
// ���α׷��ӽ� 
public class S3 {
	public static void main(String[] args) {
		String new_id="...!@BaT#*..y.abcdefghijklm";
		
		System.out.println(solution(new_id));
	}
	
	public static String solution(String new_id) {
        /*
    1�ܰ� new_id�� ��� �ҹ��ڷ� ġȯ. (lowerCase())
    2�ܰ� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ���� 
    3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� -> �ϳ��� ��ħǥ(.)�� ġȯ replace
    4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ���� trim
    5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� ���� if(new_id=null) new_id="a"
    6�ܰ� new_id 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� ���� subString(0,15)
     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
    7�ܰ� new_id�� ���̰� 2�� ���϶��, 
    new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.*/
        
		
		
        String answer = new_id.toLowerCase().replaceAll("[^a-z0-9-._]", "").replaceAll("[.]{2,}", ".").replaceAll("^[.]|[.]$", "");
        answer = answer.length() == 0 ? "a" : answer;
        answer = answer.length() > 15 ? answer.substring(0,15).replaceAll("^\\.|\\.$", "") : answer;
        while(answer.length() < 3) {
        	answer += answer.substring(answer.length()-1);
        }
        
        return answer;
    }
}
