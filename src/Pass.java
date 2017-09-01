class Data{
	int a;

	Data(int x){
		a = x;
	}
	
	int Ref(Data D){
		D.a = 50;
		return D.a;
	}

	int Val(int a){
		a = 50;
		return a;
	}
	
}

class Pass{

	public static void main(String args[]){
		int a = 2;
		Data d = new Data(2);

		System.out.println("Passed by value");
		System.out.println("Function output:- " +  d.Val(a) + " a:- " + a + "\n");
		System.out.println("Passed by reference:- ");
		System.out.println("Function output:- " + d.Ref(d) + " d.a:- " + d.a);
	}
}
