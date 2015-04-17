package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		// Given
		//String input = "0";
		String expected = "zéro";
		//Convert myConvert = new Convert();
		// When
		//String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, new Convert().num2text("0"));
	}
	@Test
	public void test_num3text_un(){
		
		Assert.assertEquals("11", new Convert().text2num("Onze"));
		
	
	}
	@Test
	public void test_num3text_deux(){
		Assert.assertEquals("13", new Convert().num2text("Treize"));
	}
	
}
