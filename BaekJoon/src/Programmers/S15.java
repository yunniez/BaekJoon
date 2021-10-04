package Programmers;
//2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT
//
//�Դϴ�. ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� "TUE"�� ��ȯ�ϼ���.
//
//���� ����
//2016���� �����Դϴ�.
//2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
public class S15 {
	public static void main(String[] args) {
		int a = 8;
		int b = 31;
		String answer = solution(a,b);
		System.out.println(answer);
	}
	
	
	 public static String solution(int a, int b) {
		 int[] days = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		 String[] weeks = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		 String answer = "";
		 
		 int idx=b;
		 
		 if(a==1){
			 idx = idx%7-1;
			if(idx==-1)idx=6;
			answer = weeks[idx];
		 }else{
		    for(int i=1; i<a; i++){
		    	idx += days[i]; 
		    }
		    
		    idx = idx%7-1;
		 
		 	if(idx==-1)idx=6;
		 	answer = weeks[idx];
		 
		 }
		  return answer;
	    }
}
