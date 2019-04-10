package n0410;

//원도우 사이즈 소스
import java.awt.Frame;

class MyWindow extends Frame {
	MyWindow(String str) {
		super(str);
		this.setSize(300, 500);
		this.setVisible(true);
	}
}

public class Study2 {
	public static void main(String[] args) {
		MyWindow mw = new MyWindow("문자열");
	}
}
//윈도우 버튼을 좌표로 설정했을경우 사이즈 변동이있을때 깨짐
//컴포넌트의 위치를 자동으로 하는것이 좋다(객체)layout(배치관리자)
//기술적인 문제는 강사님한테
