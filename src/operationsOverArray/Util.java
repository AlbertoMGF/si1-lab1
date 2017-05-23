package operationsOverArray;

public class Util <T extends Comparable<T>>  {
	
	public T getMax(T[] arr){
		if (arr.length < 1) {
			return null;
		}else{
			T max = arr[0];
			
			for (int i = 0; i < arr.length; i++) {
				if (max.compareTo(arr[i]) < 0) {
					max = arr[i];
				}
			}
			
			return max;
		}		
	}

}
