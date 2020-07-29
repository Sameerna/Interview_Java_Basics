import java.util.*;
public class Tower {
	static void towerHanoi(int n,char from_rod,char to_rod,char aux_rod) {
		if (n==1) {
			System.out.println("Move disk 1 from rod"+ from_rod + "to rod "+ to_rod);
		}
		towerHanoi(n-1,from_rod,aux_rod,to_rod);
		System.out.println(" movie disk "+n+"from rod"+from_rod+"to rod"+ to_rod);
		towerHanoi(n-1,aux_rod,to_rod,from_rod);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of disks");
		int n = sc.nextInt();
		
		towerHanoi(n,'A','B','C');
	}

}
