
public class AlgorithmFactory {
	public static IAlgorithm getAlgo(int algorithm) {
		IAlgorithm algo=null;
		if (algorithm==1)
			algo=new QuickSort();
		else if (algorithm==3)
			algo=new HeapSort();
		else if (algorithm==2)
			algo=new InsertionSort();
		else
			algo=new NullAlgo();
		
		return algo;
	}
}
