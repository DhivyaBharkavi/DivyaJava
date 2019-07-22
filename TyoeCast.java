package exercise21july19;

public class TyoeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object k[]={3,4.5,'A','b',true};
		Object o = k[0];
		Object o1=k[2];
		Integer t = (Integer)o;
		Character c1=(Character)o1;
		int x=t;
		char y=c1;
		int a=500;
		byte b =(byte)a;
		int c=b;
		System.out.println(b);
		System.out.println(a);
		System.out.println(o);
		System.out.println(t);
		System.out.println(x);
		System.out.println(y);
	}

}
