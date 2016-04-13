import static org.junit.Assert.*;
import org.junit.*;
 
public class CalculatorTest {
 
	Calculator calc = new Calculator();


   
   @Test
   public void testadd1() {
    assertEquals(10.0, calc.add(5.0,5.0),0.0d);
    }
   
   @Test
   public void testadd2() {
    assertEquals(-20.0, calc.add(-10.0,-10.0),0.0d);
    }
   
   @Test
   public void testadd3() {
    assertEquals(-2.0, calc.add(5.0,-7.0),0.0d);
    }
   
   @Test
   public void testsub1() {
    assertEquals(-2.0, calc.sub(5.0,7.0),0.0d);
    }
   
   @Test
   public void testsub2() {
    assertEquals(12.0, calc.sub(5.0,-7.0),0.0d);
    }
   
   @Test
   public void testsub3() {
    assertEquals(2.0, calc.sub(-5.0,-7.0),0.0d);
    }
   
   @Test
   public void testmult1() {
    assertEquals(10.0, calc.mult(5.0,2.0),0.0d);
    }
   
   @Test
   public void testmult2() {
    assertEquals(-35.0, calc.mult(5.0,-7.0),0.0d);
    }
   
   @Test
   public void testmult3() {
    assertEquals(35.0, calc.mult(-5.0,-7.0),0.0d);
    }
   
   @Test
   public void testdiv1() {
    assertEquals(5.0, calc.div(10.0,2.0),0.0d);
    }
   
   @Test
   public void testdiv2() {
    assertEquals(-10.0, calc.div(50.0,-5.0),0.0d);
    }
   
   @Test
   public void testdiv3() {
    assertEquals(10.0, calc.div(-100.0,-10.0),0.0d);
    }
   
   
   }