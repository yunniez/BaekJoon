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
		int leftIdx = 10;
		int rightIdx = 12;
		
		for(int k=0;k<numbers.length;k++) {
		//numbers��
		int num=numbers[k];
		//�ش� ���� �� ������������ ����ϴ� �հ���
		if(num!=2 || num!=5 || num!=8 || num!=0 ) {
		switch(num) {
			case 1: case 4: case 7: answer += "L"; leftIdx=num; continue;
			case 3: case 6: case 9: answer += "R"; rightIdx=num; continue;
			}
		}
		
		if(num==2 || num==5 || num==8 || num==0 ){
			//���۽� ���� ���ڰ� 0�� ���
			if(num==0 && (leftIdx==10 && rightIdx==12)) {
				if(hand.equals("right")){
					answer += "R";
					rightIdx=num;
				}else if(hand.equals("left")){
					answer += "L";
					leftIdx=num;
				}
			}else {
			//��� �ڸ� ���� ������ ������ ���� ���� ����
				if(num==0) {num=11;}
				
				//�Ÿ� ���ϱ� = (�������� �Ÿ�) + (���� ����)
				int leftDist = Math.abs((leftIdx-1)/3-(num-1)/3) + Math.abs((leftIdx-1)%3-1); 
                int rightDist = Math.abs((rightIdx-1)/3-(num-1)/3) + Math.abs((rightIdx-1)%3-1);
                
                //�Ÿ��� ���� ��
                if(leftDist == rightDist){
                    if(hand.equals("right")){
                    	answer += "R";
    					rightIdx=num;
                    }
                    else{
                    	answer += "L";
    					leftIdx=num;
                    }
                }
                //�Ÿ��� �ٸ� ��
                else{
                	//�������� �� �����
                    if(leftDist>rightDist){
                    	answer += "R";
    					rightIdx=num;
                    }
                    else{ // ������ �� �����
                    	answer += "L";
    					leftIdx=num;
                    }   
                }
				}
			}		
		}
        return answer;
	}
}
