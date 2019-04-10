package n0410;

class One {
	int i;
	String name;

	One(int i) {
		this.i = i;
		System.out.println(i);
	}

	One(String name) {
		this.name = name;
		System.out.println(name);
	}
}

class Two extends One {
	Two(int i){
		super(i);
	}
	Two(String name){
		super(name);
	}
}

public class Super {
	public static void main(String[] args) {
		Two two = new Two(10);
		Two two1 = new Two("¿ë±¼");

	}

}
