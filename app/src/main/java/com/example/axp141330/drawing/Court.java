package com.example.axp141330.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Alan Padilla on 4/6/2017.
 */

public class Court extends View {
    private ShapeDrawable rectangle;
    public Court(Context context, AttributeSet attr){
        super(context,attr); // call super
        int width = context.getResources().getDisplayMetrics().widthPixels; // get width of screen
        int height = context.getResources().getDisplayMetrics().heightPixels;
        int x = 0; // set x start of screen 0
        int y = height-width; // y will be the height minus width
        rectangle = new ShapeDrawable(new RectShape()); // initialize a rectangle
        rectangle.getPaint().setColor(Color.GRAY); // set the color
        rectangle.setBounds(x, y, width, height); // make it be on bottom half of screen
    }


    @Override
    public void onDraw(Canvas canvas){
        rectangle.draw(canvas); // call rectangle to draw
    }
}
