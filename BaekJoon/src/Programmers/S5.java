package Programmers;

/*엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.*/
public class S5 {
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		
		String answer = solution(numbers, hand);
		System.out.println(answer);
		
	}
	
	
	public static String solution(int[] numbers, String hand) {
        
		String answer = "";
		//왼손,오른손 위치
		int leftAfter = 10;
		int rightAfter = 12;
		
		for(int k=0;k<numbers.length;k++) {
		//numbers값
		int num=numbers[k];
		//해당 숫자 시 무조건적으로 사용하는 손가락
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
			//가운데 자리 수들 가까이 있을때 어디로 가야 할지
				int leftDist = Math.abs((leftAfter-1)/3-(num-1)/3) + Math.abs((leftAfter-1)%3-1); 
                int rightDist = Math.abs((rightAfter-1)/3-(num-1)/3) + Math.abs((rightAfter-1)%3-1);
                
                //거리가 같을 때
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
                //거리가 다를 때
                else{
                	//오른쪽이 더 가까움
                    if(leftDist>rightDist){
                    	answer += "R";
    					rightAfter=num;
                    }
                    else{ // 왼쪽이 더 가까움
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
