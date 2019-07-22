package exercise21july19;
interface Interview
{
	void fact();
	void sumOfDigit();
}
class Program 
{
	void write(Interview i)
	{
		i.fact();
		i.sumOfDigit();
	}
	}	
public class Interface implements Interview {
	public void fact()
	{
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is "+fact);
	}
	public void sumOfDigit()
	{
		int sum=0,n=12;
		while(n>0)			
		{
			int re=n%10;
			sum=sum+re;
			n=n/10;
		}
		System.out.println("Sum of digit is "+sum);
	}
public static void main(String [] args){
	Program p = new Program();
	p.write(new Interface());
	
	Interview i = new Interface();
}
}
