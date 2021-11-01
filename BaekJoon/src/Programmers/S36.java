package Programmers;

/*
 * �ٸ� ��� �ڵ� (�̷� �ڸ��� ������ string���� �޾Ƽ� split���ִ°� �ξ� ������)
 * String[] temp = String.valueOf(num).split("");

int sum = 0;
for (String s : temp) {
    sum += Integer.parseInt(s);
}

if (num % sum == 0) {
        return true;
} else {
  return false;
}
}*/

public class S36 {
	public boolean solution(int x) {
        boolean answer = false;
        
        int origin = x;
        int sum = 0;
        
        while(!(x == 0)) {
        	int temp = x % 10;
        	sum += temp;
        	x = (x-temp)/10;
        }
        
        if(origin % sum == 0) {
        	answer = true;
        }
        
        return answer;
    }
}
