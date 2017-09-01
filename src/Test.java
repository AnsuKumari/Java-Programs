import java.util.*;

class Shape{
	
	void get(){}

	void print(){}
	
}

class Rectangle extends Shape{
	int l, b;

	Scanner s = new Scanner(System.in);

	
	void get(){

		System.out.println("Enter the length: ");
		l = s.nextInt();
		System.out.println("Enter the breadth: ");
		b = s.nextInt();
	}

	
	void print(){
		System.out.println("The length: " + l);
		System.out.println("The breadth: " + b);
	}
}

class Test{

	public static void main(String args[]){
		Rectangle rr = new Rectangle();

		rr.get();
		rr.print();
	}
}
