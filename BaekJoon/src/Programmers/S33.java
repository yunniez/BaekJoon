package Programmers;

public class S33 {
	public String solution(String phone_number) {
        String answer = "";
        
        String temp = phone_number.substring(phone_number.length()-4,phone_number.length());
        for(int i=0;i<phone_number.length()-4;i++) {
        	answer += "*";
        }
        
        answer = answer+temp;
        
        return answer;
        
		/* �ٸ� ��� �ڵ� (�ξ� �ð����⵵�� ����)
		 * char[] ch = phone_number.toCharArray(); for(int i = 0; i < ch.length - 4; i
		 * ++){ ch[i] = '*'; } return String.valueOf(ch);
		 */
        
    }
}
