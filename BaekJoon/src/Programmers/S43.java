package Programmers;


public class S43 {
	public static void main(String[] args) {
		String s = "aabbaccc";
		System.out.println(solution(s));
		
	}
	
	
	public static int solution(String s) {
		int answer = Integer.MAX_VALUE;

        //최대로 나눌 수 있는 글자 수
        int div = s.length()/2;
        System.out.println("최대한 나눌수 있는 글자 수 : " + div);
        
        if(s.length() == 1) {
        	return 1;
        }
        
        for (int i = 1; i <= s.length() / 2; i++) {
			StringBuilder sb = new StringBuilder();
			String tempStr = "";
			int count = 1;

			for (int j = 0; j <=  s.length() / i; j++) {
				String word = "";
				if(i*(j+1) >= s.length()) {
					word = s.substring(j*i);
				}else {
					word = s.substring(j*i, i*(j+1));
				}
				
				if (tempStr.equals(word)) {
					count++;
				} else {
					if (count > 1) {
						sb.append(count);
						count = 1;
					}
					sb.append(tempStr);
					tempStr = word;
				}
			}

			if (count > 1) {
				sb.append(count);
			}
			sb.append(tempStr);

			answer = Math.min(answer, sb.toString().length());
		}
		return answer;
    }
}
