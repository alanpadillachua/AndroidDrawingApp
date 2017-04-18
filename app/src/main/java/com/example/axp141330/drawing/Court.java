package com.example.axp141330.drawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * Created by Alan Padilla on 4/6/2017.
 */

public class Court extends View {
    private Path pathDrawn; // path drawn
    private Paint paintDrawer; // paint drawer
    private Paint paintCanvas; // paint canvas
    private Canvas canvasDraw; // canvas draw
    private Bitmap canvasBitmap; //bitmap cache
    private final int PinkColor = Color.parseColor("#ff0098");
    public Court(final Context context, AttributeSet attr){
        super(context,attr); // call super
        int width = context.getResources().getDisplayMetrics().widthPixels; // get width of screen
        int height = context.getResources().getDisplayMetrics().heightPixels; // get height
        canvasBitmap = Bitmap.createBitmap(width,height,Bitmap.Config.ARGB_8888); // initialize bitmap
        canvasDraw = new Canvas(canvasBitmap); // connect bitmap to canvas

        paintDrawer = new Paint(); // paint
        paintDrawer.setColor(PinkColor);
        paintDrawer.setAntiAlias(true);
        paintDrawer.setStrokeWidth(20);
        paintDrawer.setStyle(Paint.Style.STROKE);
        paintDrawer.setStrokeJoin(Paint.Join.ROUND);
        paintDrawer.setStrokeCap(Paint.Cap.ROUND);

        paintCanvas = new Paint(); // set the canvas
        paintCanvas.setColor(Color.DKGRAY); //

        pathDrawn = new Path();

    }



    @Override
    public void onDraw(Canvas canvas){
        canvas.drawBitmap(canvasBitmap,0,0,paintCanvas);
        canvas.drawPath(pathDrawn,paintDrawer);
    }
    @Override
    public boolean onTouchEvent(MotionEvent m){
        float touchX = m.getX();
        float touchY = m.getY();

        switch (m.getAction()) {
            case MotionEvent.ACTION_DOWN:
                pathDrawn.moveTo(touchX, touchY);
                break;
            case MotionEvent.ACTION_MOVE:
                pathDrawn.lineTo(touchX, touchY);
                break;
            case MotionEvent.ACTION_UP:
                canvasDraw.drawPath(pathDrawn,paintDrawer);
                pathDrawn.reset();
                break;
            default:
                return false;
        }

        invalidate();
        return true;
    }

    /*
    * method changes the color of the paint
    * **/
    public void setNewColor(int color) {
        paintDrawer.setColor(color);
    }
}
