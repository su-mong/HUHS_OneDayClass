package com.huhs.onedayclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    List<Integer> imgBatch = new ArrayList<>();
    Button[] btnArray;
    Button btnRestart;
    TextView tvScore;
    TextView tvClicked;

    boolean[] btnFliped;
    int flipedBtnCount;
    int flipedBtn[] = new int[2];
    int score;
    int clickNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data_Setting();
        Restart_Setting();

        Play_Game();
    }

    private void Data_Setting() {
        imgBatch.clear();
        imgBatch.add(R.drawable.img0);imgBatch.add(R.drawable.img1);imgBatch.add(R.drawable.img2);imgBatch.add(R.drawable.img3);imgBatch.add(R.drawable.img4);
        imgBatch.add(R.drawable.img5);imgBatch.add(R.drawable.img6);imgBatch.add(R.drawable.img7);imgBatch.add(R.drawable.img8);imgBatch.add(R.drawable.img9);
        imgBatch.add(R.drawable.img0);imgBatch.add(R.drawable.img1);imgBatch.add(R.drawable.img2);imgBatch.add(R.drawable.img3);imgBatch.add(R.drawable.img4);
        imgBatch.add(R.drawable.img5);imgBatch.add(R.drawable.img6);imgBatch.add(R.drawable.img7);imgBatch.add(R.drawable.img8);imgBatch.add(R.drawable.img9);

        btnArray = new Button[]{findViewById(R.id.btn01), findViewById(R.id.btn02), findViewById(R.id.btn03), findViewById(R.id.btn04), findViewById(R.id.btn05)
                , findViewById(R.id.btn06), findViewById(R.id.btn07), findViewById(R.id.btn08), findViewById(R.id.btn09), findViewById(R.id.btn10)
                , findViewById(R.id.btn11), findViewById(R.id.btn12), findViewById(R.id.btn13), findViewById(R.id.btn14), findViewById(R.id.btn15)
                , findViewById(R.id.btn16), findViewById(R.id.btn17), findViewById(R.id.btn18), findViewById(R.id.btn19), findViewById(R.id.btn20)};

        tvScore = findViewById(R.id.tvScore);
        tvClicked = findViewById(R.id.tvClicked);

        btnFliped = new boolean[]{false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false};

        flipedBtnCount = 0;

        score = 0;
        tvScore.setText("점수 : "+score+"점");
        clickNum = 0;
        tvClicked.setText("클릭 수 : "+clickNum+"번");

        Collections.shuffle(imgBatch);

        for(int i=0;i<20;i++)
            btnArray[i].setBackgroundColor(0xffeaded2);
    }

    private void Restart_Setting() {
        btnRestart = findViewById(R.id.btnRestart);

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data_Setting();
                Play_Game();
            }
        });
    }

    private void Play_Game() {
        for(int i=0;i<20;i++) {
            final int pos = i;
            btnArray[pos].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!btnFliped[pos]) {
                        btnFliped[pos] = true;
                        flipedBtn[flipedBtnCount] = pos;
                        flipedBtnCount++;
                        btnArray[pos].setBackgroundResource(imgBatch.get(pos));

                        if(flipedBtnCount == 2) {
                            clickNum++;
                            tvClicked.setText("클릭 수 : "+clickNum+"번");

                            if(imgBatch.get(flipedBtn[0]) == imgBatch.get(flipedBtn[1])) {
                                flipedBtnCount = 0;
                                btnArray[flipedBtn[0]].setOnClickListener(null);
                                btnArray[flipedBtn[1]].setOnClickListener(null);

                                score += 10;
                                tvScore.setText("점수 : "+score+"점");

                                if(score == 100)
                                    Toast.makeText(getApplicationContext(), "게임 끝. 클릭 횟수 : "+clickNum+"번", Toast.LENGTH_SHORT).show();
                            } else {
                                Timer delayTimer = new Timer();
                                TimerTask delayTask = new TimerTask() {
                                    @Override
                                    public void run() {
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                flipedBtnCount = 0;
                                                btnFliped[flipedBtn[0]] = false;
                                                btnArray[flipedBtn[0]].setBackgroundColor(0xffeaded2);
                                                btnFliped[flipedBtn[1]] = false;
                                                btnArray[flipedBtn[1]].setBackgroundColor(0xffeaded2);
                                            }
                                        });
                                    }
                                };

                                delayTimer.schedule(delayTask, 500);
                            }
                        }
                    } else {
                        btnFliped[pos] = false;
                        flipedBtnCount--;
                        btnArray[pos].setBackgroundColor(0xffeaded2);
                    }
                }
            });
        }
    }
}