import java.util.*;

class Stat{
	int l, b, h;


		static int count = 0;
	
	Stat(){
		count++;
		System.out.println("The count: " + count);
	}
	

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

class Test{

	public static void main(String args[]){
		Stat rr = new Stat();
		Stat r = new Stat();
	}
}
