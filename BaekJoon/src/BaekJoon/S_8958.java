package BaekJoon;

import java.util.Scanner;

/*"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
 * ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.

"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.

OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. 
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. 
���ڿ��� O�� X������ �̷���� �ִ�.
*/
public class S_8958 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); //�׽�Ʈ ���̽� ��
		String[] msg = new String[count];
		String[] ch=null;

		int sum = 0;
		int score = 0;
		
		for(int i=0;i<count;i++) {
			msg[i] = sc.next();
			ch = msg[i].split("");
			
			for(int k=0;k<ch.length;k++) {
				if(ch[k].equals("O")) {
					score ++;
					sum += score;
				}else {
					score=0;
					continue;
				}
			}
			System.out.println(sum);
			sum=0;
			score=0;
		}
	}
}
