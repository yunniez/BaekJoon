package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //넣는 개수
        int count = sc.nextInt();

        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=1;i<count+1;i++){
            q.add(i);
        }

        while(q.size()>1) {
			q.poll();
			int temp = q.poll();
			q.add(temp);
		}
        System.out.println(q.poll());
    }
}