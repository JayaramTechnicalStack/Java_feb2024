abstract class AbTest {
		
	public abstract void hello();
	public abstract void m1();
	

	
}
public class AbstractTest extends AbTest {
	
	public AbstractTest() {
		System.out.println("inside AbstractTest constructor");
	}
	public static void main(String[] args) {
		 AbTest ab = new AbstractTest();
		 

	}
	
	public void hello() {
		
		
	}

}
