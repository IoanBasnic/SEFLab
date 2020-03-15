package b;

public class BaseClass {

	private int myInt;
	private String myString;
	 BaseClass(String myString) {
		this.myString = myString;
	}
	
	public void setValues(BaseClass c) {
		this.myInt = c.myInt;
		this.myString = c.myString;
	}
	
	
	public void doSomething(String s, BaseClass c) {
		s = "25";
		c = new BaseClass();
		myString = "25";
		c.setValues(this);
	}
}
