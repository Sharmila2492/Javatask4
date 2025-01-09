package task4;

public class Program4 {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
	    b=20;
		System.out.println("before swapping the value of a: "+a);
		System.out.println("before swapping the value of b: "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping the value of a: "+a);
		System.out.println("after swapping the value of b: "+b);

	}

}
/*Output:
before swapping the value of a: 10
before swapping the value of b: 20
after swapping the value of a: 20
after swapping the value of b: 10*/
