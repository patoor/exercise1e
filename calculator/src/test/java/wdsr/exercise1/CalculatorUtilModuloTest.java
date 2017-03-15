package wdsr.exercise1;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doThrow;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilModuloTest {
	private Calculator calculator;
	private CalculatorUtil calcUtil;

	@Before
	public void init() {
		calculator = Mockito.mock(Calculator.class);
		calcUtil = new CalculatorUtil(calculator);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testModuloByZero() {
		//fail("Not yet implemented");
		//given
		doThrow(new IllegalArgumentException()).when(calculator).modulo(anyInt(), eq(0)); 
		
		//when
		calcUtil.getModuloText(3,0);
		
	}

	@Test
	public void testModulo16By4() {
		//fail("Not yet implemented");
		//given
		doReturn(4).when(calculator).modulo(anyInt() , anyInt());
		
		//when
		String result = calcUtil.getModuloText(16,4);
		//then
		assertEquals("16 % 4 = 4",result);
	}
}
