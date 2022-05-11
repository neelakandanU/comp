
public class Desktop implements HardWare,SoftWare {

	@Override
	public void softWareResources() {
		
		System.out.println("Software Resource:");
		
	}

	@Override
	public void hardWareResources() {
		System.out.println("Branch A");
		
	}
	public void desktopModel() {
		
		System.out.println("Desktop Model");
		
	}
	public void branchA() {
System.out.println("Branch A is updated");
	}

	public static void main(String[] args) {
		
		Desktop e = new Desktop();
		e.softWareResources();
		e.hardWareResources();
		e.desktopModel();
	}
}

