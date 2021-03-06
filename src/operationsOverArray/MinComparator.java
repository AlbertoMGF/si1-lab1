package operationsOverArray;

import java.util.Comparator;

public class MinComparator<T extends Comparable<T>> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		if (o1.compareTo(o2) < 0) {
			return 1;
		}else if(o1.compareTo(o2) > 0){
			return -1;
		}
		return 0;
	}

}
