package BaekJoon;
/*
Java: long sum(int[] a); (Ŭ���� �̸�: Test)
a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
*/
public class S_15596 {
	
	public class Test {
	    long sum(int[] a) {
	        long length=a.length;
	        long ans = 0;
	    	for(int i=0;i<length;i++) {
	    		ans += a[i];
	    	}
	        return ans;
	    }
	}
}
