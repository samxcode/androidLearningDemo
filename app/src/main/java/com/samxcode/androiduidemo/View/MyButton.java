package com.samxcode.androiduidemo.View;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by SamXCode on 2016/8/29.
 */
public class MyButton extends Button {
    private static final String TAG = "MainActivity";

    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: //按下的动作
                Log.d(TAG, "View      dispatchTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE: //滑动的动作
                Log.d(TAG, "View      dispatchTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP: //离开的动作
                Log.d(TAG, "View      dispatchTouchEvent ACTION_UP");
                break;
        }

        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: //按下的动作
                Log.d(TAG, "View      onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE: //滑动的动作
                Log.d(TAG, "View      onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP: //离开的动作
                Log.d(TAG, "View      onTouchEvent ACTION_UP");
                break;
        }

        return false;
    }
}
