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
		int a = 1;
		int b = 6;
		String answer = solution(a,b);
		System.out.println(answer);
	}
	
	
	 public static String solution(int a, int b) {
	        String answer = "";
	        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
	        int count = 0; //�� ��¥
	        
	        //��¥ ���ϱ�
	        count = b;
	        for(int i=1;i<=a-1;i++) {
			  if(i%2==0 && i!=2) {
			      count += 30;
			  }else if(i%2==1) {
			      count += 31;
			  }else if(i==2) {
			      count += 29;
			  		}
		      }
	        
	        int idx = (count%7);
	        if(idx==-1) idx=6;
	        
	        
	        answer = day[idx];
	        
	        return answer;
	    }
}
