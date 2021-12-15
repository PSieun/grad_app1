package com.example.grad_app1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton; //메뉴 이미지 버튼들
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;

    CalendarView calendarView;

    ImageView imageView1; //메인
    ImageView imageView2; //galaxy
    ImageView imageView3; //inform

    Button button1; //inform 안에 버튼들
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    int btnIndex = 0; //메뉴 이미지버튼들
    int cldIndex = 0; //캘린더뷰
    int imgV2Index = 0; //galaxy
    int imgV3Index = 0; //inform

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.menu);
        imageButton2 = findViewById(R.id.calendar);
        imageButton3 = findViewById(R.id.moon);
        imageButton4 = findViewById(R.id.costel);
        imageButton5 = findViewById(R.id.galaxy);
        imageButton6 = findViewById(R.id.inform);

        calendarView = findViewById(R.id.calendarView);

        imageView1 = findViewById(R.id.backg);
        imageView2 = findViewById(R.id.galaxy_bg);
        imageView3 = findViewById(R.id.infor_bg);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.backbutton); //g
        button6 = findViewById(R.id.backbutton2); //i

    }


    public void menuShow(View v) {
        Showmenu();
    }

    private void Showmenu() {
        if (btnIndex == 0) {
            imageButton2.setVisibility(View.VISIBLE);
            imageButton3.setVisibility(View.VISIBLE);
            imageButton4.setVisibility(View.VISIBLE);
            imageButton5.setVisibility(View.VISIBLE);
            imageButton6.setVisibility(View.VISIBLE);
            btnIndex = 1;

        } else if (btnIndex == 1) {
            imageButton2.setVisibility(View.INVISIBLE);
            imageButton3.setVisibility(View.INVISIBLE);
            imageButton4.setVisibility(View.INVISIBLE);
            imageButton5.setVisibility(View.INVISIBLE);
            imageButton6.setVisibility(View.INVISIBLE);
            btnIndex = 0;
        }

    }

    public void calendarShow(View v) {
        Showcalendar();
    }

    private void Showcalendar() {
        if (btnIndex == 0) {
            //캘린더 버튼 & 캘린더뷰 보이기, 안보이기
            if (cldIndex == 0) {
                calendarView.setVisibility(View.VISIBLE);
                cldIndex = 1;
            } else if (cldIndex == 1) {
                calendarView.setVisibility(View.INVISIBLE);
                cldIndex = 0;
            }
            btnIndex = 1;
        }else if (btnIndex == 1) {
            btnIndex = 0;
        }
    }

    public void galaxyShow(View v) {
        Showgalaxy();
    }

    private void Showgalaxy() {
        if (btnIndex == 0) {
            if (imgV2Index == 0) {
                imageView1.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.VISIBLE);

                imageButton5.setVisibility(View.VISIBLE);
                imageButton6.setVisibility(View.INVISIBLE);

                button5.setVisibility(View.VISIBLE);

                imgV2Index = 1;
            } else if (imgV2Index == 1) {
                imageView1.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.INVISIBLE);

                imageButton5.setVisibility(View.INVISIBLE);
                imageButton6.setVisibility(View.VISIBLE);

                button5.setVisibility(View.INVISIBLE);

                imgV2Index = 0;
            }
            
        }else if (btnIndex == 1) {
            btnIndex = 0;
        }
    }


    public void inforShow(View v) {
        Showinfor();
    }

    private void Showinfor() {
        if (btnIndex == 0) {
            if (imgV3Index == 0) {
                imageView3.setVisibility(View.VISIBLE);
                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
                imageView1.setVisibility(View.INVISIBLE);
                imgV3Index = 1;
            } else if (imgV3Index == 1) {
                imageView3.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                button6.setVisibility(View.INVISIBLE);
                imageView1.setVisibility(View.VISIBLE);
                imgV3Index = 0;
            }
        }else if (btnIndex == 1) {
            btnIndex = 0;
        }
    }
}