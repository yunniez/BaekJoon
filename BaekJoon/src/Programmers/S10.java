package Programmers;

import java.util.Arrays;

public class S10 {
	
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		String answer = solution(participant,completion);
		System.out.println(answer);
	}
	
	//1¹ø ¹æ¹ý
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0;
        for (i=0; i<completion.length; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];

    }
	
}
