package Programmers;

public class S40 {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		
		System.out.println(solution(price, money, count));
	}
	
	public static long solution(long price, long money, long count) {
        long answer = 0;
        
        for(int i = 1; i <= count ; i++){
            money -= (price * i);
        }
        
        if(money < 0){
            answer = Math.abs(money);
        }

        return answer;
    }
}
