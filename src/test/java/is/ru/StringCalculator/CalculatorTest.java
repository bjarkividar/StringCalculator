package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

  @Test
  public void testEmptyString() {
    assertEquals(0, Calculator.add(""));
  }

  @Test
  public void testOneNumber() {
    assertEquals(1, Calculator.add("1"));
  }

  @Test
  public void testTwoNumbers() {
    assertEquals(3, Calculator.add("1,2"));
  }
  @Test
  public void testMultipleNumbers() {
    assertEquals(6, Calculator.add("1,2,3"));
  }

  @Test
  public void testDifferentDelimiter() {
    assertEquals(6, Calculator.add("1\n2,3"));
  }
  @Test
  public void testNegativeNumber() {
    try{
        Calculator.add("-5,2");
    }catch(Exception e) {
      assertEquals(e.getMessage(),"Negatives not allowed: -5");
    }
  }
  @Test
  public void testMultipleNegativeNumbers() {
    try{
        Calculator.add("2,-4,3,-5");
    }catch(Exception e) {
      assertEquals(e.getMessage(),"Negatives not allowed: -4,-5");
    }
  }
  @Test
  public void testBiggerThan1000() {
    assertEquals(2, Calculator.add("1001,2"));
  }
  @Test
  public void testDelimeter() {
    assertEquals(6, Calculator.add("//;\n1;2,3"));
  }
}
