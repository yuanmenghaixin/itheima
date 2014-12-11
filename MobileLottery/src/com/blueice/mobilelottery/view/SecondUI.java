package com.blueice.mobilelottery.view;

import com.blueice.mobilelottery.ConstValue;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

/**
 * 简单界面二。
 *
 */
public class SecondUI extends BaseUI {

	public SecondUI(Context context) {
		super(context);
	}

	public View getChildView(){
		
		TextView tv = new TextView(context);
		
		LayoutParams params = tv.getLayoutParams(); //获取TextView原来的Params
		params = new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT); //修改Params。
		tv.setLayoutParams(params );  //设置Params.
		
		tv.setBackgroundColor(Color.MAGENTA);
		tv.setText("第二个简单界面。");
		
		return tv;
	}
	
	public int getID(){
		return ConstValue.VIEW_SECOND;
	}
}
