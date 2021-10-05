package Programmers;

import java.util.Stack;

public class S17 {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        int length = board[0].length;

        for(int i=0; i<moves.length; i++) {
            for(int j=0; j<length; j++) {
                int temp = board[j][moves[i]-1];

                if(temp != 0) {
                    if(!stack.empty()) {
                        if(temp == stack.peek()) {
                            stack.pop();
                            answer++;
                        } else {
                            stack.push(temp);
                        }
                    } else {
                        stack.push(temp);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer * 2;
    }
}
