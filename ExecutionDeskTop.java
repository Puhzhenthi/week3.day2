package week3.day2.assignments;

public class ExecutionDeskTop extends Desktop {


	public void hardwareResources() {
System.out.println("Hardware Resources from hardware");
		
	}

	public void softwareResources() {
	
	System.out.println("Software Resources from software");	
	}

	@Override
	public void desktopModel() {
		System.out.println("Desktop model from desktop");
		
	}
public static void main(String[] args ) {
	ExecutionDeskTop obj= new ExecutionDeskTop();
	obj.hardwareResources();
	obj.softwareResources();
	obj.desktopModel();
	
	
}
}
