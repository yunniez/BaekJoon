package Programmers;

import java.util.HashSet;

public class S49 {
	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
        int answer = 0;
        int count = (nums.length / 2);
        //Arrays.sort(nums);
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int temp : nums) {
        	set.add(temp);
        }
        
        System.out.println(set);
        
        if(set.size() > count) {
        	answer = count;
        }else {
        	answer = set.size();
        }
        
        
        
        return answer;
    }
}
