
public class fibonacci {

	public static void calcFibByte(int n) {
		byte t1 = 0, t2 = 1, tn = 0;
		System.out.println(t1);
		System.out.println(t2);
		for (int i = 3; i <= n; i++){
		tn = (byte) (t1 + t2) ;
	        t1 = t2;
	        t2 = tn;
                System.out.println(tn);	}
		
	}
	
	public static void calcFibShort(int n) {
		short t1 = 0, t2 = 1, tn = 0;
		System.out.println(t1);
		System.out.println(t2);
		for (int i = 3; i <= n; i++){
		tn = (short) (t1 + t2) ;
	        t1 = t2;
	        t2 = tn;
                System.out.println(tn);	}
		
	}
	
	public static void calcFibInt(int n) {
		int t1 = 0, t2 = 1, tn = 0;
		System.out.println(t1);
		System.out.println(t2);
		for (int i = 3; i <= n; i++){
		tn = (int) (t1 + t2) ;
	        t1 = t2;
	        t2 = tn;
                System.out.println(tn);	}
		
	}
	
	public static void calcFibLong(int n) {
		long t1 = 0, t2 = 1, tn = 0;
		System.out.println(t1);
		System.out.println(t2);
		for (int i = 3; i <= n; i++){
		tn = (long) (t1 + t2) ;
	        t1 = t2;
	        t2 = tn;
                System.out.println(tn);	}
		
	}
	
	public static void main (String[] args) {
		//Usando el tipo byte, el maximo n es 12
		calcFibByte(12);
		//Usando el tipo short, el maximo n es 24
		calcFibShort(24);
		//Usando el tipo int, el maximo n es 47
		calcFibInt(47);
		//Usando el tipo long, el maximo n es 93
		calcFibLong(93);
	}
}
