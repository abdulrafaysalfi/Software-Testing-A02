import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PerimeterTest {
//p=2*(w+h)
	@ParameterizedTest
	@ValueSource(ints= {1,2,15,29,30})
	void Test01(int height)
	{
		Rectangle r=new Rectangle();
		assertEquals(2*(1+height),r.perimeterOfRectangle(1, height));
	}
	@ParameterizedTest
	@ValueSource(ints= {1,2,15,29,30})
	void Test02(int height)
	{
		Rectangle r=new Rectangle();
		assertEquals(2*(2+height),r.perimeterOfRectangle(2, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,15,29,30})
	void Test03(int height)
	{
		Rectangle r=new Rectangle();
		assertEquals(2*(15+height),r.perimeterOfRectangle(15, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,15,29,30})
	void Test04(int height)
	{
		Rectangle r=new Rectangle();
		assertEquals(2*(29+height),r.perimeterOfRectangle(29, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,15,29,30})
	void Test05(int height)
	{
		Rectangle r=new Rectangle();
		assertEquals(2*(30+height),r.perimeterOfRectangle(30, height));
	}
	

}
