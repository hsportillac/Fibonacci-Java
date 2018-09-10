
public class Fibonacci {
	
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    
	public static void main (String[] args) {
		int n = 47;
		for (int i = 1; i <= n; i++)
            System.out.println("Fibonacci para n " + i +":" + fibonacci(i));	
	}

}
