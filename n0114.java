package n0410;

class A {
	A() {
		// 모든 클래스는 자동상속함 object
		super();// 자바의 모든 클래스는 자동 상속으로 만들어진다.
		System.out.println("나는 A입니다.");
	}// A 클래스의 생성자
}

class B extends A {
	B() {
		// 상속관계에서 조상의 생성자를 호출하는 프로그램을 해야한다
		// 그런데, 조상의 생정자 호출 프로그램을 생략하면 자동으로 프로그램된다
		// 생성자가 생성자를 호출할때 생성자이름을 this라고 한다
		// 생성자가 조상의 생성자를 호출할때 생성자이름을 super라고 한다.
		super();
		System.out.println("나는 B입니다.");
	}
}

class c {
	c() {
	}// 기본생성자
}

public class n0114 {

	public static void main(String[] args) {
		A a = new A();
		B baby = new B();
		c c = new c();
		
		IamSon son = new IamSon("용구리");
	}
}

class IamKing {
	String name;

	IamKing(String name) {
		this.name = name;
		System.out.println(name);
	}
}

class IamSon extends IamKing { //부모클래스가 매개변수를 필요로 하기떄문에 값을 주지않을경우 에러가남
	IamSon(String name){
		super(name);//super안에 이름을 넣음으로 매개변수를 줘야 오류가안남
		//자식클래스는 무조건 super를 써서 부모클래스르 불러야한다.
		System.out.println("나는 왕의 자식이다.");
	}
}


class Apple {
	int price;
	Apple(int price) {
		this.price = price;
	}
}