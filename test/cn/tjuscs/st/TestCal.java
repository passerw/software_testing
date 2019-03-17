package cn.tjuscs.st;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCal {
	int input1;
	int expected;
	private Calculate cal = null;
	
	public TestCal(int input1, int expected) {
		this.input1 = input1;
		this.expected = expected;
	}
	
	@Before
	public void setUp(){
		cal = new Calculate();
	}
	
	@Parameters
	public static Collection<Object []> getData(){
		return Arrays.asList(new Object[][]{
			{84, 0},
			{0, 0},
			{24, 0},
			{29, 0},
			{41, 0},
			{36, 0},
			{33, 1},
			{83, 1},
		});
	}
	
	@Test
	public void testCal(){
		assertEquals(this.expected, cal.check(input1));
	}
	
}
