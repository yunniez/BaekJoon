package BaekJoon;

/*
7
1 6
6 3
3 5
4 1
2 4
4 7

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S_11725 {
	static List<Integer>[] list;
    static int[] parents;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        list = new ArrayList[n+1];
        parents = new int[n+1];
        check = new boolean[n+1];

        for (int i = 1; i < list.length; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i < n ; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            list[a].add(b);
            list[b].add(a);
        }
       
//         list에 담긴 상태
//        for(int i = 1; i < list.length; i++) {
//        	System.out.print(i + ": ");
//        	for(int j = 0; j < list[i].size(); j++) {
//        		System.out.print(list[i].get(j) + " ");
//        	}
//        	System.out.println();
//        }

        for (int data = 1; data < list.length; data++) {
            if(!check[data]){
                dfs(data);
            }
        }
        for (int i = 2; i < parents.length; i++) {
            System.out.println(parents[i]);
        }

        input.close();
    }

    public static void dfs(int flag){
        if(!check[flag]) {
	        check[flag] = true;			 // flag: 기준값
	        for (int node: list[flag]) { // node: flag를 기준으로 확인
	            if(!check[node]){
	                parents[node] = flag;
//	                pringArr(parents);
	                dfs(node);
	            }
	        }
        }

    }
}
