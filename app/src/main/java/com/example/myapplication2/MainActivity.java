package com.example.myapplication2;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private TextView tvOutput;
    private GestureDetectorCompat mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput = findViewById(R.id.gestureText);
        mDetector = new GestureDetectorCompat(this, this);
        mDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent event) {
        tvOutput.setText("Gesture: Down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        tvOutput.setText("Gesture: Press and Hold");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        tvOutput.setText("Gesture: Single Tap");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        tvOutput.setText("Gesture: Scroll\nDistance: X=" + distanceX + " Y=" + distanceY);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        tvOutput.setText("Gesture: Long Press");
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
        tvOutput.setText("Gesture: Fling\nVelocity: X=" + velocityX + " Y=" + velocityY);
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        tvOutput.setText("Gesture: Double Tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
        tvOutput.setText("Gesture: Double Tap Event");
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        tvOutput.setText("Gesture: Single Tap Confirmed");
        return true;
    }
}
