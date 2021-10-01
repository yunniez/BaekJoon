package Programmers;

/*�����հ����� �����¿� 4���� �������θ� �̵��� �� ������ Ű�е� �̵� �� ĭ�� �Ÿ��� 1�� �ش��մϴ�.
���� ���� 3���� ���� 1, 4, 7�� �Է��� ���� �޼� �����հ����� ����մϴ�.
������ ���� 3���� ���� 3, 6, 9�� �Է��� ���� ������ �����հ����� ����մϴ�.
��� ���� 4���� ���� 2, 5, 8, 0�� �Է��� ���� �� �����հ����� ���� Ű�е��� ��ġ���� �� ����� �����հ����� ����մϴ�.
4-1. ���� �� �����հ����� �Ÿ��� ���ٸ�, ���������̴� ������ �����հ���, �޼����̴� �޼� �����հ����� ����մϴ�.*/
public class S5 {
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		
		String answer = solution(numbers, hand);
		System.out.println(answer);
		
	}
	
	
	public static String solution(int[] numbers, String hand) {
        
		String answer = "";
		//�޼�,������ ��ġ
		int leftAfter = 10;
		int rightAfter = 12;
		
		for(int k=0;k<numbers.length;k++) {
		//numbers��
		int num=numbers[k];
		//�ش� ���� �� ������������ ����ϴ� �հ���
		if(num!=2 || num!=5 || num!=8 || num!=0 ) {
		switch(num) {
			case 1: case 4: case 7: answer += "L"; leftAfter=num; continue;
			case 3: case 6: case 9: answer += "R"; rightAfter=num; continue;
			}
		}
		
		if(num==2 || num==5 || num==8 || num==0 ){
			if(num==0 && (leftAfter==10 || rightAfter==12)) {
				if(hand.equals("right")){
					answer += "R";
					rightAfter=num;
				}else if(hand.equals("left")){
					answer += "L";
					leftAfter=num;
				}
			}else {
			//��� �ڸ� ���� ������ ������ ���� ���� ����
				int leftDist = Math.abs((leftAfter-1)/3-(num-1)/3) + Math.abs((leftAfter-1)%3-1); 
                int rightDist = Math.abs((rightAfter-1)/3-(num-1)/3) + Math.abs((rightAfter-1)%3-1);
                
                //�Ÿ��� ���� ��
                if(leftDist == rightDist){
                    if(hand.equals("right")){
                    	answer += "R";
    					rightAfter=num;
                    }
                    else{
                    	answer += "L";
    					leftAfter=num;
                    }
                }
                //�Ÿ��� �ٸ� ��
                else{
                	//�������� �� �����
                    if(leftDist>rightDist){
                    	answer += "R";
    					rightAfter=num;
                    }
                    else{ // ������ �� �����
                    	answer += "L";
    					leftAfter=num;
                    }   
                }
				}
			}		
		}
        return answer;
	}
}
