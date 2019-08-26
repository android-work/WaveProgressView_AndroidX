package com.work.android.waveprogressview;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.work.android.wave_progress.WaveProgress;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WaveProgress waveProgress = findViewById(R.id.wrap_progress);
        waveProgress.setProgress(0.5f);
        waveProgress.setTextColor(Color.WHITE);
        waveProgress.setWaveColor(getResources().getColor(R.color.color1));
        waveProgress.setTextSize(40);
        waveProgress.setWaveCount(2);
        waveProgress.setWaveHeight(10);
    }
}
