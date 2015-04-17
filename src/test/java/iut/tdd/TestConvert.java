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
		Assert.assertEquals(expected,  Convert.num2text("0"));
	}
	@Test
	public void test_num3text_onze(){
		
		Assert.assertEquals("11",  Convert.num2text("Onze"));
		
	
	}
	@Test
	public void test_num3text_treize(){
		Assert.assertEquals("13",  Convert.num2text("Treize"));
	}
	@Test
	public void test_num3text_quatre(){
		Assert.assertEquals("4",  Convert.num2text("Quatre"));
	}
	@Test
	public void test_num3text_cinq(){
		Assert.assertEquals("5",  Convert.num2text("Cinq"));
	}
	@Test
	public void test_num3text_six(){
		Assert.assertEquals("6",  Convert.num2text("Six"));
	}
	@Test
	public void test_num3text_sept(){
		Assert.assertEquals("7",  Convert.num2text("Sept"));
	}
	@Test
	public void test_num3text_huit(){
		Assert.assertEquals("8",  Convert.num2text("Huit"));
	}
	@Test
	public void test_num3text_neuf(){
		Assert.assertEquals("9",  Convert.num2text("neuf"));
	}
	@Test
	public void test_num3text_dix(){
		Assert.assertEquals("10",  Convert.num2text("Dix"));
	}
	@Test
	public void test_num3text_douze(){
		Assert.assertEquals("12",  Convert.num2text("Douze"));
	}
	@Test
	public void test_num3text_quinze(){
		Assert.assertEquals("15",  Convert.num2text("Quinze"));
	}
	
}
