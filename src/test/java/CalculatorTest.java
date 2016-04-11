import static org.junit.Assert.*;
import org.junit.*;
 
public class CalculatorTest {
 
	Calculator calc = new Calculator();


   
   @Test
   public void testadd1() {
    assertEquals("Unexepected error during addition!", 10.0, calc.add(5.0,5.0),0.0d);
   }
   
   
   @Test
   public void testadd2() {
    assertEquals("Unexepected error during addition!", 2.0, calc.add(-3.0,5.0),0.0d);
   }
   
   @After
   public void after() {
    System.out.println("After");
   }
   
   @Ignore
   public void ignore() {
    System.out.println("Ignore");
   }
   
//   @Test
//   public void test2() {
//    System.out.println("Test2");
//   }
//   
//   @AfterClass
//   public static void afterclass() {
//    System.out.println("AfterClass");
//   }
   
   }