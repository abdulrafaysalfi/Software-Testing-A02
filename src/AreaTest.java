import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AreaTest {

	@ParameterizedTest
	@ValueSource(ints= {1,2,15,29,30})
	void Test01(int height)
	{
		Rectangle r=new Rectangle();
		assertEquals((1*height),r.areaOfRectangle(1, height));
	}
	@ParameterizedTest
	@ValueSource(ints= {1,2,15,29,30})
	void Test02(int height)
	{
		Rectangle r=new Rectangle();
		assertEquals((2*height),r.areaOfRectangle(2, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,15,29,30})
	void Test03(int height)
	{
		Rectangle r=new Rectangle();
		assertEquals((15*height),r.areaOfRectangle(15, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,15,29,30})
	void Test04(int height)
	{
		Rectangle r=new Rectangle();
		assertEquals((29*height),r.areaOfRectangle(29, height));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,15,29,30})
	void Test05(int height)
	{
		Rectangle r=new Rectangle();
		assertEquals((30*height),r.areaOfRectangle(30, height));
	}

}
