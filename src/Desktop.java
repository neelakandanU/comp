
public class Desktop implements HardWare,SoftWare {

	@Override
	public void softWareResources() {
		
		System.out.println("Software Resource:");
		
	}

	@Override
	public void hardWareResources() {
		System.out.println("Hardware Resource");
		
	}
	public void branchB() {
		
		System.out.println("Desktop Model");
		
	}

	public static void main(String[] args) {
		
		Desktop e = new Desktop();
		e.softWareResources();
		e.hardWareResources();
		e.branchB();
	}
}

