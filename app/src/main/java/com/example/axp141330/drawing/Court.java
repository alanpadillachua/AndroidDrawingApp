package com.example.axp141330.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
    private ShapeDrawable rectangle;
    private ShapeDrawable circle;
    private RadioButton orange;
    private RadioButton purple;
    private RadioButton pink;
    private RadioButton green;
    private int buttonColor;
    private RadioGroup colorChoiceButton;
    private final int OrangeColor = Color.parseColor("#ff9400");
    private final int PurpleColor = Color.parseColor("#a100c1");
    private final int PinkColor = Color.parseColor("#ff0098");
    private final int greenColor = Color.parseColor("#05aa00");

    public Court(final Context context, AttributeSet attr){
        super(context,attr); // call super
        int width = context.getResources().getDisplayMetrics().widthPixels; // get width of screen
        int height = context.getResources().getDisplayMetrics().heightPixels;
        int x = 0; // set x start of screen 0
        int y = 0; // y will be the height - width
        rectangle = new ShapeDrawable(new RectShape()); // initialize a rectangle
        rectangle.getPaint().setColor(Color.DKGRAY); // set the color
        rectangle.setBounds(x, y, width, height); // make it be on bottom half of screen
        circle = new ShapeDrawable(new OvalShape());
        circle.setIntrinsicWidth(width);

       /* orange = (RadioButton)findViewById(R.id.OrangeButton); // get orange button
        purple = (RadioButton)findViewById(R.id.PurpleButton); // get purple button
        green = (RadioButton)findViewById(R.id.GreenButton); // get green button
        pink = (RadioButton)findViewById(R.id.PinkButton); // get pink button
        colorChoiceButton = (RadioGroup) findViewById(R.id.colorButtons);
        colorChoiceButton.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.OrangeButton:
                        buttonColor = OrangeColor;
                        break;
                    case R.id.PurpleButton:
                        buttonColor = PurpleColor;
                        // TODO Something
                        break;
                    case R.id.GreenButton:
                        buttonColor = greenColor;
                        // TODO Something
                        break;
                    case R.id.PinkButton:
                        buttonColor = PinkColor;
                        // TODO Something
                        break;
                }
            }
        });
        //intially setting red paint
        colorChoiceButton.check(R.id.PinkButton);

*/


    }



    @Override
    public void onDraw(Canvas canvas){
        rectangle.draw(canvas); // call rectangle to draw

        //circle.draw(canvas);

    }
}
