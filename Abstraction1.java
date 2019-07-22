package exercise21july19;
interface FirstReview
{
public void login();
public void logout();
}
interface Exam extends FirstReview 
{
	public void prepare();
	public void logout();
}
public class Abstraction1 implements Exam  { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

}
