package parallelScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test
  public void testOne() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test31 in SampleThree..."+id);
  }
  
  @Test
  public void testTwo() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test32 in SampleThree..."+id);
  }
  
  @Test
  public void testThree() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test33 in SampleThree..."+id);
  }
  
  @Test
  public void testFour() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test34 in SampleThree..."+id);
  }

	// In TestNG, the @Test(threadPoolSize=x) annotation defines the
	// number of threads to be used while running a test method.
//	@Test(invocationCount = 6, threadPoolSize = 2, timeOut = 1000)
//	public void testFour() {
//		long id = Thread.currentThread().getId();
//		System.out.println("Test34 in SampleThree..." + id);
//	}
}
