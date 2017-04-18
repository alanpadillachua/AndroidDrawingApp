package com.example.axp141330.drawing;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;

public class mainDrawing extends AppCompatActivity {
    public Court paintCourt;
    private RadioGroup colorChoiceButton;
    private SeekBar sizeBar;
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
        /***
         *  Set up the min and max of seek bar
         * */
        final int step = 1; // set it as 1
        final int max = (this.getResources().getDisplayMetrics().widthPixels)/4;// get the 4th of the size
        final int min = 3; // min size is 3
        sizeBar = (SeekBar)findViewById(R.id.brushSizeBar);
        sizeBar.setMax((max-min)/step); // set the max

        sizeBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float size = min + (progress * step);
                paintCourt.updateSize(size);
            }
        });


    }
}
