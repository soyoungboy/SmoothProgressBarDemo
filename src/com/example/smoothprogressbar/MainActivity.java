package com.example.smoothprogressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import fr.castorflex.android.circularprogressbar.CircularProgressDrawable;

public class MainActivity extends Activity {
	private Button start_btn;
	private Button end_btn;
	//圆形进度条
	private fr.castorflex.android.circularprogressbar.CircularProgressBar circularProgressBar;
	//水平进度条
	private fr.castorflex.android.smoothprogressbar.SmoothProgressBar smoothProgressBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		start_btn = (Button) findViewById(R.id.start_btn);
		end_btn = (Button) findViewById(R.id.end_btn);

		circularProgressBar = (fr.castorflex.android.circularprogressbar.CircularProgressBar) findViewById(R.id.circularProgressBar);
		smoothProgressBar = (fr.castorflex.android.smoothprogressbar.SmoothProgressBar) findViewById(R.id.smoothProgressBar);

		start_btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				//圆形进度条转动
				CircularProgressDrawable drawable = (CircularProgressDrawable) circularProgressBar
						.getIndeterminateDrawable();
				drawable.start();
				//水平进度条启动
				smoothProgressBar.progressiveStart();
			}
		});
		end_btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				//圆形进度条停止转动
				CircularProgressDrawable drawable = (CircularProgressDrawable) circularProgressBar
						.getIndeterminateDrawable();
				drawable.progressiveStop();
				//水平进度条停止启动
				smoothProgressBar.progressiveStop();

			}
		});
	}

}
