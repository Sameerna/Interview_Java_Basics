
public class IsPrime {
	
	static boolean isPrime( int n) {
			if(n%2 == 0) return false;
			for(int i = 3; i<=Math.sqrt(n);i+=2) {
				if(n%i==0)
					return true;
				
			}
			return false;
	}

	public static void main(String[] args) {
		IsPrime p = new IsPrime();
				if(p.isPrime(8));
				
	}

}
