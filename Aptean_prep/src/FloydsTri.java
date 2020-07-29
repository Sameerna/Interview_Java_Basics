import java.util.*;

public class FloydsTri {

	public static void main(String[] args) {
		int n,num=1,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number of rows of floyd's triangle");
		n=sc.nextInt();
		
		
		for(c=1;c<=n;c++) {
			for(d=1;d<=c;d++) {
				System.out.println(" "+num);
				num++;
			}
			System.out.println();
		}
	}

}
