package n0410;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
//�������� ��ư ����� �۾� �ҽ�
class Mywin extends Frame{
	Button[] btns;//��ư : ��ư �迭�θ��� 
	Label[] lbl; //���̺�: �޼��� ��¿� ��ü  ex)id �Է��ϰ� id�� Ȯ�����ּ��� ����� ���ڿ��� ������ִ°��� �Ѱ���
	Checkbox ckb1, ckb2; //üũ�ڽ� ���� v 
	Checkbox radio1,radio2,radio3,radio4;//������ư üũ�ڽ��θ���
	CheckboxGroup cbg;
	Mywin(String str){
		super(str);//�������� ����
		btns = new Button[5];
		lbl = new Label[5];
		cbg = new CheckboxGroup(); //üũ�ڽ��� �׷����� ���� ��ü
		radio1 = new Checkbox("Sal part",cbg,true);//�⺻����
		radio2 = new Checkbox("Manage part",cbg,false);
		radio3 = new Checkbox("IT part",cbg,false);
		radio4 = new Checkbox("Shipping part",cbg,false);
		this.add(radio1);this.add(radio2);this.add(radio3);this.add(radio4);
		ckb1 = new Checkbox("�뱸��",true); //�⺻����
		ckb2 = new Checkbox("��������Ƥ���");
		this.add(ckb1); this.add(ckb2);
		lbl[0] = new Label("�̸� ���");
		lbl[0].setForeground(Color.DARK_GRAY);
		lbl[1] = new Label("��й�ȣ ���");
		lbl[1].setForeground(Color.BLUE);
		lbl[2] = new Label("��ư������");
		lbl[2].setForeground(Color.GREEN);
		lbl[3] = new Label("�����Է��ض�");
		lbl[3].setForeground(Color.GRAY);
		lbl[4] = new Label("�� ����");
		lbl[4].setForeground(Color.CYAN);
		for(int i =0; i<btns.length; i++) {
			btns[i] = new Button("��ư"+i);
			btns[i].setForeground(Color.blue); //��ư�� �� ����
		}
		//��ġ������ ���
		this.setLayout(new FlowLayout()); //����� ��ġ������ ����
		this.add(lbl[0]); this.add(btns[0]); //���̺� //��ư
		this.add(lbl[1]); this.add(btns[1]); 
		this.add(lbl[2]); this.add(btns[2]); 
		this.add(lbl[3]); this.add(btns[3]); 
		this.add(lbl[4]); this.add(btns[4]); 
		//�������� ���� ����, ���� ����ϴ� ��ü Color
		this.setBackground(Color.yellow);
		this.setSize(300, 200); //������ ������
		this.setVisible(true);//
		this.setResizable(false); //����ڰ� ������ ����� �ٲܼ������� �����ϴ°���
		
	}
	
}

public class Study3 {

	public static void main(String[] args) {
		Mywin win = new Mywin("������");
	}

}
