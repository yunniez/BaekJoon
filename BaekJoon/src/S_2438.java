import java.util.Scanner;

public class S_2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++){
	        for(int j=0;j<=i;j++){
	           System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}