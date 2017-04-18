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
    private RadioGroup colorChoiceButton;
    private final int OrangeColor = Color.parseColor("#ff9400");
    private final int PurpleColor = Color.parseColor("#a100c1");
    private final int PinkColor = Color.parseColor("#ff0098");
    private final int GreenColor = Color.parseColor("#05aa00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawing);
        paintCourt = (Court)findViewById(R.id.courtDraw);
        colorChoiceButton = (RadioGroup) findViewById(R.id.colorButtons);
        colorChoiceButton.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.OrangeButton:
                      paintCourt.setNewColor(OrangeColor); // set the new color
                        break;
                    case R.id.PurpleButton:
                        paintCourt.setNewColor(PurpleColor); // set the new color
                        break;
                    case R.id.GreenButton:
                        paintCourt.setNewColor(GreenColor); // set the new color
                        break;
                    case R.id.PinkButton:
                        paintCourt.setNewColor(PinkColor); // set the new color
                        break;
                }
            }
        });
        //intially setting red paint
        colorChoiceButton.check(R.id.PinkButton);


    }
}
