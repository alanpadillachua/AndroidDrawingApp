package com.example.axp141330.drawing;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class mainDrawing extends AppCompatActivity {
    public Court paintCourt;
    private RadioButton orange;
    private RadioButton purple;
    private RadioButton pink;
    private RadioButton green;
    private RadioGroup colorChoiceButton;
    private int buttonColor;
    private final int OrangeColor = Color.parseColor("#ff9400");
    private final int PurpleColor = Color.parseColor("#a100c1");
    private final int PinkColor = Color.parseColor("#ff0098");
    private final int greenColor = Color.parseColor("#05aa00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawing);
        paintCourt = (Court)findViewById(R.id.courtDraw);
        orange = (RadioButton)findViewById(R.id.OrangeButton); // get orange button
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


    }
}
