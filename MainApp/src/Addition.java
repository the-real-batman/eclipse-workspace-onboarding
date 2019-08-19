import java.util.Scanner;

public class Addition {
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		
		Addition addition = new Addition();
		int result= addition.add(first, second);
		
		System.out.println(result);
	}

}
