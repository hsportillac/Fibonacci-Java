public class Fibonacci {
	
	public static void main (String[] args) {
		int n = 48, t1 = 0, t2 = 1, tn = 0;
		System.out.println(t1);
		System.out.println(t2);
		for (int i = 3; i <= n; i++){
			tn = t1 + t2;
	        t1 = t2;
	        t2 = tn;
            System.out.println(tn);	}
	}

}
