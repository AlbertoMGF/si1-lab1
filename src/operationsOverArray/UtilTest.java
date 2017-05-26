package operationsOverArray;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class UtilTest {
	public Integer[] array1;
	public Integer[] array2;
	public Integer[] array3;
	public Integer[] array4;
	
	@Before
	public void init(){
		array2 = new Integer[1];
		array3 = new Integer[10];
		array4 = new Integer[0];
	}

	@Test
	public void testA() {
		Util<Integer> tool = new Util<Integer>();
		Integer result = tool.getMax(array1);
		Assert.assertEquals(result, null);
	}
	
	@Test
	public void testB() {
		Util<Integer> tool = new Util<Integer>();
		Integer result = tool.getMax(array2);
		Assert.assertEquals(result, null);
	}
	
	@Test
	public void testC() {
		Util<Integer> tool = new Util<Integer>();
		Integer result = tool.getMax(array4);
		Assert.assertEquals(result, null);
	}
	
	@Test
	public void testD() {
		array3[0] = new Integer(10);
		Util<Integer> tool = new Util<Integer>();
		Integer result = tool.getMax(array3);
		Assert.assertEquals(result, new Integer(10));
	}
	
	@Test
	public void testE() {
		array3[5] = new Integer(10);
		Util<Integer> tool = new Util<Integer>();
		Integer result = tool.getMax(array3);
		Assert.assertEquals(result, new Integer(10));
	}
	
	@Test
	public void testF() {
		array3[2] = new Integer(10);
		array3[9] = new Integer(-100);
		array3[5] = new Integer(190);
		array3[7] = new Integer(90);
		Util<Integer> tool = new Util<Integer>();
		Integer result = tool.getMax(array3);
		Assert.assertEquals(result, new Integer(190));
	}
	
	@Test
	public void testG() {
		array3[0] = new Integer(10);
		Util<Integer> tool = new Util<Integer>();
		Integer result = tool.getMin(array3);
		Assert.assertEquals(result, new Integer(10));
	}
	
	@Test
	public void testH() {
		array3[5] = new Integer(10);
		Util<Integer> tool = new Util<Integer>();
		Integer result = tool.getMin(array3);
		Assert.assertEquals(result, new Integer(10));
	}
	
	@Test
	public void testI() {
		array3[2] = new Integer(10);
		array3[9] = new Integer(-100);
		array3[5] = new Integer(190);
		array3[7] = new Integer(90);
		Util<Integer> tool = new Util<Integer>();
		Integer result = tool.getMin(array3);
		Assert.assertEquals(result, new Integer(-100));
	}

}
