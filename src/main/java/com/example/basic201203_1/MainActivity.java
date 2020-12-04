package com.example.basic201203_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //뷰의 주솔ㄹ 담을 변수 선언
    TextView text1, text2, text3, text4, text5; //멤버변수
    Button button1, button2, button3, button4, button5, button6, button7, button8;
    TextView textCheck;
    TextView textl1, textl2, textl3, textl4; //멤버변수

    CheckBox check1, check2, check3, check4;

    //list로 해보기
    List<TextView> tvlist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView)findViewById(R.id.text1); // id 정수값을 이용하여 view를 찾아서 캐스팅하고 그 값을 참조변수에 저장
        text2 = (TextView)findViewById(R.id.text2); // id 정수값을 이용하여 view를 찾아서 캐스팅하고 그 값을 참조변수에 저장
        text3 = (TextView)findViewById(R.id.text3); // id 정수값을 이용하여 view를 찾아서 캐스팅하고 그 값을 참조변수에 저장
        text4 = (TextView)findViewById(R.id.text4); // id 정수값을 이용하여 view를 찾아서 캐스팅하고 그 값을 참조변수에 저장
        text5 = (TextView)findViewById(R.id.text5); // id 정수값을 이용하여 view를 찾아서 캐스팅하고 그 값을 참조변수에 저장

        textCheck = (TextView)findViewById(R.id.textCheck);
        check1 = (CheckBox)findViewById(R.id.checkBox1);
        check2 = (CheckBox)findViewById(R.id.checkBox2);
        check3 = (CheckBox)findViewById(R.id.checkBox3);
        check4 = (CheckBox)findViewById(R.id.checkBox4);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);

        textl1 = (TextView)findViewById(R.id.textl1); // id 정수값을 이용하여 view를 찾아서 캐스팅하고 그 값을 참조변수에 저장
        textl2 = (TextView)findViewById(R.id.textl2); // id 정수값을 이용하여 view를 찾아서 캐스팅하고 그 값을 참조변수에 저장
        textl3 = (TextView)findViewById(R.id.textl3); // id 정수값을 이용하여 view를 찾아서 캐스팅하고 그 값을 참조변수에 저장
        textl4 = (TextView)findViewById(R.id.textl4); // id 정수값을 이용하여 view를 찾아서 캐스팅하고 그 값을 참조변수에 저장

        text1.setText("문자열1"); //text의 값을 화면에 넣을때는 setText, 가져올 떄는 getText
        text2.setText("문자열2"); //text의 값을 화면에 넣을때는 setText, 가져올 떄는 getText
        text3.setText("문자열3"); //text의 값을 화면에 넣을때는 setText, 가져올 떄는 getText
        text4.setText("문자열4"); //text의 값을 화면에 넣을때는 setText, 가져올 떄는 getText

        //새로운 문자열 생성
        TextView[] tv = {text1, text2, text3, text4};
        TextView[] tv1 = {textl1, textl2, textl3, textl4};
        for(int i=0; i< tv.length; i++) {
            tv[i].setText("이 배열의 길이가 질들어가는지" + (i+1)*100); //setter에 저장하면 화면에 출력됨
        }
//        tvlist.add(textl1);
//        tvlist.add(textl2);
//        tvlist.add(textl3);
//        tvlist.add(textl4);
        for(int i=0; i<tv1.length; i++) { //arraylist에 추가
            tvlist.add(tv1[i]);
        }
        tvlist.get(0).getText();

        int j = 1;
        for(TextView i : tvlist) { //advanced for문
            i.setText("이게머냐" + (j * 100)); //arraylist에서 데이터 가져와서 화면에 출력
        }

        //리스너 객체 생성
        BtnListener1 listener1 = new BtnListener1(); //객체 생성

        //리스너를 버튼 객체에 설정한다.
        button1.setOnClickListener(listener1); //button1에 리스너 연결

        //리스너 객체 생성
        BtnListener2 listener2 = new BtnListener2(); //객체 생성

        //리스너를 버튼 객체에 설정한다.
        button2.setOnClickListener(listener2); //button1에 리스너 연결


        //리스너 객체 생성
        BtnListener34 listener3 = new BtnListener34(); //객체 생성

        //리스너를 버튼 객체에 설정한다.
        button3.setOnClickListener(listener3); //button1에 리스너 연결
        button4.setOnClickListener(listener3); //button1에 리스너 연결

        //리스너 객체 생성
        BtnListener78 listener78 = new BtnListener78(); //객체 생성

        //리스너를 버튼 객체에 설정한다.
        button7.setOnClickListener(listener78); //button1에 리스너 연결
        button8.setOnClickListener(listener78); //button1에 리스너 연결

        CheckBoxListener listenerC = new CheckBoxListener();
        check1.setOnCheckedChangeListener(listenerC);
        check2.setOnCheckedChangeListener(listenerC);
        check3.setOnCheckedChangeListener(listenerC);
        check4.setOnCheckedChangeListener(listenerC);
    }




    //첫번째 버튼과 연결된 리스너(운영체제 OS(안드로이드)가 어떤 이벤트가 발생하면 그 동장을 운영체제가 안다)
    class BtnListener1 implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            if(text5.getText() != "") {
                text5.setText("");
            }
            else {
                text5.setText("첫번째 버튼이 눌렸습니다.");
            }


        }
    }

    //첫번째 버튼과 연결된 리스너(운영체제 OS(안드로이드)가 어떤 이벤트가 발생하면 그 동장을 운영체제가 안다)
    class BtnListener2 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            text5.setText("두번째 버튼이 눌렸습니다.");
        }
    }

    //첫번째 버튼과 연결된 리스너(운영체제 OS(안드로이드)가 어떤 이벤트가 발생하면 그 동장을 운영체제가 안다)
    class BtnListener34 implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            //이벤트가 발생된 뷰의 id 값 추출
            int id = v.getId();
            //id

            switch (id) {
                case R.id.button3:
                    text5.setText("세번째 버튼");
                    break;
                case R.id.button4:
                    text5.setText("네번째 버튼");
                    break;
            }

        }
    }

    public void btn5Method(View view) {
        text5.setText("다섯번째 버튼");
    }

    public void btn6Method(View view) {
        text5.setText("여섯번째 버튼");
    }


    //하나의 listener 를 이용하여 button7, button8을 view의 id를 받아서 분기하여 textView에 어떤 버튼이 눌렸는지 출력하세요
    class BtnListener78 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            int id = v.getId();

            if(id == R.id.button7) {
                text5.setText("일곱번쨰버튼");
            }
            else if(id == R.id.button8) {
                text5.setText("여덟번쨰 버튼");
            }

        }
    }

    //첫번째 버튼을 누르면 호출되는 메서드
    //체크 상태 값을 파악한다.
    public void checkMethod1 (View view) {
        textCheck.setText("");

        //체크 상태에 따라 필요한 처리를 해준다.
        boolean a1 = check1.isChecked();
        boolean a2 = check2.isChecked();
        boolean a3 = check3.isChecked();
        boolean a4 = check4.isChecked();

        if(a1 == true) {
            textCheck.append("첫번째 체크박스가 체크되어 있습니다.\n");
        }
        if(a2 == true) {
            textCheck.append("첫번째 체크박스가 체크되어 있습니다.\n");
        }
        if(a3 == true) {
            textCheck.append("첫번째 체크박스가 체크되어 있습니다.\n");
        }

    }
    //두번째 버튼과 연결된 메서드
    //모든 체크 박스의 상태를 체크상태로 설정
    public void checkMethod2 (View view) {
        check1.setChecked(true);
        check2.setChecked(true);
        check3.setChecked(true);
        check4.setChecked(true);
    }
    //세번째 버튼과 연결된 메서드
    //모든 체크 박스의 상태를 체크 해제로 설정
    public void checkMethod3(View view) {
        check1.setChecked(false);
        check2.setChecked(false);
        check3.setChecked(false);
        check4.setChecked(false);
    }
    //네번째 버튼과 연결된 메서드
    //모든 체크 박스의 체크 상태를 반전시킨다
    public void checkMethod4(View view) {
        check1.toggle();
        check2.toggle();
        check3.toggle();
        check4.toggle();
    }

    //체크 박스의 체크 상태가 변경되면 반응하는 리스너
    class CheckBoxListener implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            //체크상태가 변경된 체크박스의 id를 가져온다.
            int id = buttonView.getId();
            switch (id) {
                case R.id.checkBox1:
                    if(isChecked == true) {
                        textCheck.setText("첫번째 체크 박스가 체크되었습니다");
                    } else {
                        textCheck.setText("첫번째체크박스가 해제되었습니다");
                    }
                    break;
                case R.id.checkBox2:
                    if(isChecked == true) {
                        textCheck.setText("첫번째 체크 박스가 체크되었습니다");
                    } else {
                        textCheck.setText("첫번째체크박스가 해제되었습니다");
                    }
                    break;
                case R.id.checkBox3:
                    if(isChecked == true) {
                        textCheck.setText("첫번째 체크 박스가 체크되었습니다");
                    } else {
                        textCheck.setText("첫번째체크박스가 해제되었습니다");
                    }
                    break;
                case R.id.checkBox4:
                    if(isChecked == true) {
                        textCheck.setText("첫번째 체크 박스가 체크되었습니다");
                    } else {
                        textCheck.setText("첫번째체크박스가 해제되었습니다");
                    }
                    break;
            }

        }
    }
}