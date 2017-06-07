package com.why.project.densityutildemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.why.project.densityutildemo.util.DensityUtil;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initData();
	}

	private void initData(){
		/**====================================DensityUtil========================================*/
		int screenWidth = DensityUtil.getScreenWidth(this);
		int screenHeight = DensityUtil.getScreenHeight(this);
		Log.w(TAG,"screenWidth="+screenWidth);
		Log.w(TAG,"screenHeight="+screenHeight);

		int dp = DensityUtil.px2dip(this,50);
		int px = DensityUtil.dip2px(this,dp);
		Log.w(TAG,"dp="+dp);
		Log.w(TAG,"px="+px);

		DensityUtil.RATIO = 0.95f;
		int dpRatio = DensityUtil.px2dipRatio(this,50);
		int pxRatio = DensityUtil.dip2pxRatio(this,dpRatio);
		Log.w(TAG,"dpRatio="+dpRatio);
		Log.w(TAG,"pxRatio="+pxRatio);

		int statusBarHeight = DensityUtil.getStatusBarHeight(this);
		Log.w(TAG,"barHeight="+statusBarHeight);
	}
}
