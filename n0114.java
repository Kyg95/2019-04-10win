package n0410;

class A {
	A() {
		// ��� Ŭ������ �ڵ������ object
		super();// �ڹ��� ��� Ŭ������ �ڵ� ������� ���������.
		System.out.println("���� A�Դϴ�.");
	}// A Ŭ������ ������
}

class B extends A {
	B() {
		// ��Ӱ��迡�� ������ �����ڸ� ȣ���ϴ� ���α׷��� �ؾ��Ѵ�
		// �׷���, ������ ������ ȣ�� ���α׷��� �����ϸ� �ڵ����� ���α׷��ȴ�
		// �����ڰ� �����ڸ� ȣ���Ҷ� �������̸��� this��� �Ѵ�
		// �����ڰ� ������ �����ڸ� ȣ���Ҷ� �������̸��� super��� �Ѵ�.
		super();
		System.out.println("���� B�Դϴ�.");
	}
}

class c {
	c() {
	}// �⺻������
}

public class n0114 {

	public static void main(String[] args) {
		A a = new A();
		B baby = new B();
		c c = new c();
		
		IamSon son = new IamSon("�뱸��");
	}
}

class IamKing {
	String name;

	IamKing(String name) {
		this.name = name;
		System.out.println(name);
	}
}

class IamSon extends IamKing { //�θ�Ŭ������ �Ű������� �ʿ�� �ϱ⋚���� ���� ����������� ��������
	IamSon(String name){
		super(name);//super�ȿ� �̸��� �������� �Ű������� ��� �������ȳ�
		//�ڽ�Ŭ������ ������ super�� �Ἥ �θ�Ŭ������ �ҷ����Ѵ�.
		System.out.println("���� ���� �ڽ��̴�.");
	}
}


class Apple {
	int price;
	Apple(int price) {
		this.price = price;
	}
}