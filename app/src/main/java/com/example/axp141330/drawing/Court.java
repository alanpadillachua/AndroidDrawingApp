package com.example.axp141330.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by laptop on 4/6/2017.
 */

public class Court extends View {
    private ShapeDrawable rectangle;
    public Court(Context context, AttributeSet attr){
        super(context,attr);


        int width = context.getResources().getDisplayMetrics().widthPixels;
        int height = context.getResources().getDisplayMetrics().heightPixels;
        int x = height/2;
        int y = 0;
        rectangle = new ShapeDrawable(new RectShape());
        rectangle.getPaint().setColor(0xff74AC23);
        rectangle.setBounds(x, y, x + height, y + width);
    }


    @Override
    public void onDraw(Canvas canvas){
        rectangle.draw(canvas);
    }
}
