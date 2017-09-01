import java.util.*;

class Box{
	int l, b, h;

	Scanner s = new Scanner(System.in);

	void get(){

		System.out.println("Enter the length: ");
		l = s.nextInt();
		System.out.println("Enter the breadth: ");
		b = s.nextInt();
		System.out.println("Enter the height: ");
		h = s.nextInt();
	}

	void print(){
		System.out.println("The length: " + l);
		System.out.println("The breadth: " + b);
		System.out.println("The height: " + h);
	}
	
}

class ColoredBox extends Box{
	String c = new String();

	Scanner s = new Scanner(System.in);

	
	void get(){
		super.get();
		System.out.println("Enter the color: ");
		c = s.next();
	}

	
	void print(){
		super.print();
		System.out.println("The color: " + c);
	}
}

class Test{

	public static void main(String args[]){
		ColoredBox rr = new ColoredBox();

		rr.get();
		rr.print();
	}
}
