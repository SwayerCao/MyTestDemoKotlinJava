package com.example.mvp.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.myapplication.R;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class MyAlbum extends FrameLayout{

    private ArrayList<String> imageList;

    private RecyclerView albumRv;

    private double horizontalPerX,horizontalPerY;
    private double width,height;

    public MyAlbum( Context context) {
        this(context, null);
    }

    public MyAlbum(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyAlbum( Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public MyAlbum( Context context,AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        horizontalPerY = 0.5;
        horizontalPerX = 0.5;
        initView(context);
    }

    private void initView(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_album,this);
//
//        LayoutInflater layoutInflater = LayoutInflater.from(context).inflate(R.layout.)
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        width = widthMeasureSpec
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        addView(new ImageView(getContext()));
        canvas.clipRect(new Rect(50,50,50,50));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        double touchX = event.getX();
        double touchY = event.getY();

        return super.onTouchEvent(event);

    }


}
