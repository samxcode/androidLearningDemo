package com.samxcode.androiduidemo.View;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by SamXCode on 2016/8/29.
 */
public class MyLinearLayout extends LinearLayout {

    private static final String TAG = "MainActivity";

    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN: //按下的动作
                Log.d(TAG, "ViewGroup " + getId() + " dispatchTouchEvent ACTION_DOWN");
//                if (getId() == R.id.first_layout) {
//                    return super.dispatchTouchEvent(ev);
//                } else
//                    return false;
                break;
            case MotionEvent.ACTION_MOVE: //滑动的动作
                Log.d(TAG, "ViewGroup " + getId() + " dispatchTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP: //离开的动作
                Log.d(TAG, "ViewGroup " + getId() + " dispatchTouchEvent ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN: //按下的动作
                Log.d(TAG, "ViewGroup " + getId() + " onInterceptTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE: //滑动的动作
                Log.d(TAG, "ViewGroup " + getId() + " onInterceptTouchEvent ACTION_MOVE");
//                if (getId() == R.id.first_layout) {
//                    return false;
//                } else
//                    return true;
                break;
            case MotionEvent.ACTION_UP: //离开的动作
                Log.d(TAG, "ViewGroup " + getId() + " onInterceptTouchEvent ACTION_UP");
                break;
        }
//        if (getId() == R.id.first_layout) {
//            return false;
//        } else
            return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: //按下的动作
                Log.d(TAG, "ViewGroup " + getId() + " onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE: //滑动的动作
                Log.d(TAG, "ViewGroup " + getId() + " onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP: //离开的动作
                Log.d(TAG, "ViewGroup " + getId() + " onTouchEvent ACTION_UP");
                break;
        }

        return false;
    }


}
