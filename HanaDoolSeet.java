package n0410;

class Hana {
	int i;
	int j;
	double k;

	Hana(int i, int j) {
		this.i = i;
		this.j = j;
		System.out.println("i의 값:" + i + "j의 값:" + j);
	}

	Hana(double k) {
		this.k = k;
		System.out.println("k의 값:"+k);
	}
}

class Dool extends Hana {
	Dool(int i, int j) {
		super(i, j);
	}

	Dool(double k) {
		super(k);
	}
}

class Seet extends Dool {
	Seet(int i, int j) {
		super(i, j);

	}

	Seet(double k) {
		super(k);
	}
}

class HanaDoolSeet {
	public static void main(String[] args) {
		Seet seet = new Seet(10, 10);
		Seet seet1 = new Seet(10.1);

	}
}
