package n0410;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

class Windo extends Frame {
	Label[] lbl;
	Checkbox ckb1, ckb2, ckb3;
	Checkbox radio1, radio2, radio3;
	CheckboxGroup cbg;

	Windo(String str) {

		super(str);
		lbl = new Label[2];
		cbg = new CheckboxGroup();
		lbl[0] = new Label("설치되어있는 os 선택");
		lbl[0].setForeground(Color.DARK_GRAY);
		ckb1 = new Checkbox("윈도우98");
		ckb2 = new Checkbox("윈도우 2000");
		ckb3 = new Checkbox("윈도우 xp");
		lbl[1] = new Label("컴퓨터 cpu 종류 선택");
		lbl[1].setForeground(Color.ORANGE);
		radio1 = new Checkbox("펜티엄4", cbg, false);
		radio2 = new Checkbox("애슬론xp", cbg, false);
		radio3 = new Checkbox("셀러론", cbg, false);

		this.setLayout(new FlowLayout());
		this.add(lbl[0]);
		this.add(ckb1);
		this.add(ckb2);
		this.add(ckb3);
		this.add(lbl[1]);
		this.add(radio1);
		this.add(radio2);
		this.add(radio3);
		this.setBackground(Color.MAGENTA);
		this.setSize(400, 200); // 윈도우 사이즈
		this.setVisible(true);//
		this.setResizable(false); // 사용자가 윈도우 사이즈를 바꿀수없도록 고정하는거임
	}
}

public class Study4 {
	public static void main(String[] args) {
		Windo wo = new Windo("도전과제");

	}

}
