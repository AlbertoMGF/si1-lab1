package operationsOverArray;

import java.util.Comparator;

public class Util <T extends Comparable<T>>  {
	
	public String toString(T[] arr){
		String s = "[";
		
		if (arr.length < 1) {
			s += "]";
		}else{
			for (int i = 0; i < arr.length - 1; i++) {
				s += arr[i] + " ,"; 
			}
			s += arr[arr.length - 1];
			s += "]";
		}
		
		return s;
	}
	
	public T getMax(T[] arr){
		return getMaxItem(arr, new MaxComparator<T>());
	}
	
	public T getMin(T[] arr){
		return getMaxItem(arr, new MinComparator<T>());
	}
	
	private T getMaxItem(T[] arr, Comparator<T> comp){
		if (isArrayValid(arr)) {
			
			T ObjectiveIten = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != null) {
					if (ObjectiveIten != null) {
						if (comp.compare(ObjectiveIten, arr[i]) < 0) {
							ObjectiveIten = arr[i];
						}
					}else{
						ObjectiveIten = arr[i];
					}
				}
			}
			
			return ObjectiveIten;
		}else{
			return null;
		}	
	}
	
	private boolean isArrayValid(T[] arr){
		if (arr != null) {
			if (arr.length >= 1) {
				if (getOccupedSize(arr) >= 1) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	private int getOccupedSize(T[] arr){
		int Occupedsize = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				++Occupedsize;
			}
		}
		return Occupedsize;
	}

}
