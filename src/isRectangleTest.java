import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class isRectangleTest {

	@ParameterizedTest
	@ValueSource(ints= {2,15,29,30})
	void Test01(int height)
	{
		Rectangle r=new Rectangle();
		assertTrue(r.isRectangle(1, height, 1, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,15,29,30})
	void Test02(int height)
	{
		Rectangle r=new Rectangle();
		assertTrue(r.isRectangle(2, height, 2, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,29,30})
	void Test03(int height)
	{
		Rectangle r=new Rectangle();
		assertTrue(r.isRectangle(15, height, 15, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,15,1,30})
	void Test04(int height)
	{
		Rectangle r=new Rectangle();
		assertTrue(r.isRectangle(29, height, 29, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,15,29,1})
	void Test05(int height)
	{
		Rectangle r=new Rectangle();
		assertTrue(r.isRectangle(30, height, 30, height));
	}
	//----------------------------------------Next----------------------------------
	@ParameterizedTest
	@ValueSource(ints= {2,15,29,1,30})
	void Test06(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 1, 1, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,15,29,1,30})
	void Test07(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 1, 2, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,15,29,1,30})
	void Test08(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 1, 15, height));
	}

	@ParameterizedTest
	@ValueSource(ints= {2,15,29,1,30})
	void Test09(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 1, 29, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,15,29,1,30})
	void Test10(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 1, 30, height));
	}
	
	//-------------------------------------NEXT------------------------
	@ParameterizedTest
	@ValueSource(ints= {15,29,1,30})
	void Test11(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 2, 1, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {15,29,1,30})
	void Test12(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 2, 2, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {15,29,1,30})
	void Test13(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 2, 15, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {15,29,1,30})
	void Test14(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 2, 29, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {15,29,1,30})
	void Test15(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 2, 30, height));
	}
	//------------------------------------------------NEXT------------------------
	@ParameterizedTest
	@ValueSource(ints= {2,29,1,30})
	void Test16(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 15, 1, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,29,1,30})
	void Test17(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 15, 2, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,29,1,30})
	void Test18(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 15, 15, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,29,1,30})
	void Test19(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 15, 29, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,29,1,30})
	void Test20(int height)
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(1, 15, 30, height));
	}
}
