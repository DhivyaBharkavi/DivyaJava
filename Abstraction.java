package exercise21july19;
abstract class Bank
{
	public final void showMessage()
	{
		System.out.println("Welcome");
	}
	abstract int getInterestRate();
}
public class TMB extends Bank
{
	void show()
	{
		System.out.println("Hello");
		
	}

	@Override
	int getInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ab straction has a incompeleted and no object creation
		Bank b = new Bank();
		b.showMessage();
		b.getInterestRate();
		
		TMB t = new TMB();
		t.getInterestRate();
		t.showMessage();
		t.show();
	}

}
