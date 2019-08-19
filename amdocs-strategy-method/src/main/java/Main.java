import java.util.Scanner;

public class Main {
	
	public static void displayMenu() {
		System.out.println("Main menu");
		System.out.println("Quick sort-->1");
		System.out.println("Insertion sort-->2");
		System.out.println("Heap sort-->3");
		System.out.println("Exit-->4");
	}
	
	public static int getChoice() {
		System.out.println("Enter your choice: ");
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void doWork(int choice) {
		IAlgorithm algorithm=AlgorithmFactory.getAlgo(choice);
		algorithm.sort();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		while(choice!=4) {
			displayMenu();
			choice=getChoice();
			if(choice!=4)
				doWork(choice);
		}
		System.out.println("Application exited"); 
	}

}
