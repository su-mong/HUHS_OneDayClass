package com.huhs.onedayclass;

/*private void Play_Game1() {
        for(int i=0;i<20;i++) {
            final int pos = i;
            btnArray[pos].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(btnFliped[pos] == false) {
                        btnFliped[pos] = true;
                        flipedBtnCount++;
                        btnArray[pos].setBackgroundResource(imgBatch.get(pos));
                    } else {
                        btnFliped[pos] = false;
                        flipedBtnCount--;
                        btnArray[pos].setBackgroundColor(0xffeaded2);
                    }
                }
            });
        }
    }*/

/*
private void Play_Game2() {
        for(int i=0;i<20;i++) {
            final int pos = i;
            btnArray[pos].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(btnFliped[pos] == false) {
                        btnFliped[pos] = true;
                        flipedBtn[flipedBtnCount] = pos;
                        flipedBtnCount++;
                        btnArray[pos].setBackgroundResource(imgBatch.get(pos));

                        if(flipedBtnCount == 2) {
                            if(imgBatch.get(flipedBtn[0]) == imgBatch.get(flipedBtn[1])) {
                                flipedBtnCount = 0;
                                btnArray[flipedBtn[0]].setOnClickListener(null);
                                btnArray[flipedBtn[1]].setOnClickListener(null);
                            } else {
                                flipedBtnCount = 0;
                                btnFliped[flipedBtn[0]] = false;
                                btnArray[flipedBtn[0]].setBackgroundColor(0xffeaded2);
                                btnFliped[flipedBtn[1]] = false;
                                btnArray[flipedBtn[1]].setBackgroundColor(0xffeaded2);
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
 */

/*
private void Play_Game3() {
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
                            if(imgBatch.get(flipedBtn[0]) == imgBatch.get(flipedBtn[1])) {
                                flipedBtnCount = 0;
                                btnArray[flipedBtn[0]].setOnClickListener(null);
                                btnArray[flipedBtn[1]].setOnClickListener(null);
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
 */

/*
private void Play_Game4() {
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
                            if(imgBatch.get(flipedBtn[0]) == imgBatch.get(flipedBtn[1])) {
                                flipedBtnCount = 0;
                                btnArray[flipedBtn[0]].setOnClickListener(null);
                                btnArray[flipedBtn[1]].setOnClickListener(null);

                                score += 10;
                                tvScore.setText("점수 : "+score+"점");

                                if(score == 100)
                                    Toast.makeText(getApplicationContext(), "게임 끝!!!", Toast.LENGTH_SHORT).show();
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
 */