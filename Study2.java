package n0410;

//������ ������ �ҽ�
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
		MyWindow mw = new MyWindow("���ڿ�");
	}
}
//������ ��ư�� ��ǥ�� ����������� ������ ������������ ����
//������Ʈ�� ��ġ�� �ڵ����� �ϴ°��� ����(��ü)layout(��ġ������)
//������� ������ ���������
