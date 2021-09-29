import java.util.Arrays;
import java.util.Scanner;

/*�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. 
��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.

ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�
*/

public class S_1546 {
	public static void main(String[] args) {
		int M = 0; // �ڱ� ���� �� �ִ�
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); //���� �� ������ ����(100���� �۰ų� ����)
		int[] score = new int[count]; // ����
		int i = 0;
		
		//���� �Է� 
		for(i=0;i<count;i++) {
			score[i] = sc.nextInt();
		}
		
		//���� �� �ִ� ����
		Arrays.sort(score);
		M = score[count-1];
		double[] newScore = new double[count];
		
		float sum = 0;
		float avg = 0;
		
		for(i=0;i<count;i++) {
			newScore[i] = (double)score[i]/M *100;
			sum += newScore[i];
		}
		
		avg = sum/count;
		System.out.println(avg);
		
	}
}
