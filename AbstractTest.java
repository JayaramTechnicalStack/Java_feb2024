abstract class AbTest {
	public AbTest() {
		System.out.println("inside AbTest constructor from Git Hub ");
		}
	public abstract void hello();
	public abstract void m1();
	

	
}
public class AbstractTest extends AbTest {
	
	public AbstractTest() {
		System.out.println("inside AbstractTest constructor conflicts will come");
	}
	public static void main(String[] args) {
		 AbTest ab = new AbstractTest();
		 

	}
	
	public void hello() {
		
		
	}

}
