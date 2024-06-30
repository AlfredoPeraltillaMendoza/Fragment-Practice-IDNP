package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class FlechaView extends View {
    private Paint paint;

    public FlechaView(Context context) {
        super(context);
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();

        Path path = new Path();
        path.moveTo(0, height / 2);
        path.lineTo(width - 10, height / 2);
        path.lineTo(width - 20, height / 2 - 10);
        path.moveTo(width - 10, height / 2);
        path.lineTo(width - 20, height / 2 + 10);
        canvas.drawPath(path, paint);
    }
}