package n0410;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
//원도우의 버튼 만드는 작업 소스
class Mywin extends Frame{
	Button[] btns;//버튼 : 버튼 배열로만듬 
	Label[] lbl; //레이블: 메세지 출력용 객체  ex)id 입력하고 id를 확인해주세요 라던지 문자열을 출력해주는것을 총괄함
	Checkbox ckb1, ckb2; //체크박스 만듬 v 
	Checkbox radio1,radio2,radio3,radio4;//라디오버튼 체크박스로만듬
	CheckboxGroup cbg;
	Mywin(String str){
		super(str);//원도우의 제목
		btns = new Button[5];
		lbl = new Label[5];
		cbg = new CheckboxGroup(); //체크박스를 그룹으로 묶는 객체
		radio1 = new Checkbox("Sal part",cbg,true);//기본선택
		radio2 = new Checkbox("Manage part",cbg,false);
		radio3 = new Checkbox("IT part",cbg,false);
		radio4 = new Checkbox("Shipping part",cbg,false);
		this.add(radio1);this.add(radio2);this.add(radio3);this.add(radio4);
		ckb1 = new Checkbox("용구리",true); //기본선택
		ckb2 = new Checkbox("집에가즈아ㅏㅏ");
		this.add(ckb1); this.add(ckb2);
		lbl[0] = new Label("이름 써라");
		lbl[0].setForeground(Color.DARK_GRAY);
		lbl[1] = new Label("비밀번호 써라");
		lbl[1].setForeground(Color.BLUE);
		lbl[2] = new Label("버튼눌러라");
		lbl[2].setForeground(Color.GREEN);
		lbl[3] = new Label("정보입력해라");
		lbl[3].setForeground(Color.GRAY);
		lbl[4] = new Label("응 ㅅㄱ");
		lbl[4].setForeground(Color.CYAN);
		for(int i =0; i<btns.length; i++) {
			btns[i] = new Button("버튼"+i);
			btns[i].setForeground(Color.blue); //버튼의 색 조정
		}
		//배치관리자 사용
		this.setLayout(new FlowLayout()); //사용할 배치관리자 선언
		this.add(lbl[0]); this.add(btns[0]); //레이블 //버튼
		this.add(lbl[1]); this.add(btns[1]); 
		this.add(lbl[2]); this.add(btns[2]); 
		this.add(lbl[3]); this.add(btns[3]); 
		this.add(lbl[4]); this.add(btns[4]); 
		//원도우의 배경색 지정, 색을 담당하는 객체 Color
		this.setBackground(Color.yellow);
		this.setSize(300, 200); //윈도우 사이즈
		this.setVisible(true);//
		this.setResizable(false); //사용자가 윈도우 사이즈를 바꿀수없도록 고정하는거임
		
	}
	
}

public class Study3 {

	public static void main(String[] args) {
		Mywin win = new Mywin("으에에");
	}

}
