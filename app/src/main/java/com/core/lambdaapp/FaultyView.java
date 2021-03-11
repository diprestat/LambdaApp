package com.core.lambdaapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;


public class FaultyView extends View {
    public FaultyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        System.out.println("This is a draw !");
        Paint paint = new Paint();
        canvas.drawRect(new Rect(20, 20, 20, 20), paint);
        // draw the mPath with the mPaint on the canvas when onDraw
        //canvas.drawPath(mPath, mPaint);
    }
}
